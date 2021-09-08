
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dao;

import com.so.util.HiberCon;
import com.so.pojo.SoSpecializationMasterPojo;
import com.so.util.BeanObject;
import com.so.util.FilterBean;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author Dell India
 */
public class ServicesDao {

    private final SessionFactory fac = HiberCon.getSessionFactory();

    public List<SoSpecializationMasterPojo> services() {
        Session sess = fac.openSession();
        List<SoSpecializationMasterPojo> list = new ArrayList<>();
        try {
            String query = "select specialization_id, name, description, img_path from so_specialization_master ssm where ssm.status='A'";

            List existList = sess.createSQLQuery(query)
                    .addScalar("specialization_id", StandardBasicTypes.LONG)
                    .addScalar("name", StandardBasicTypes.STRING)
                    .addScalar("description", StandardBasicTypes.STRING)
                    .addScalar("img_path", StandardBasicTypes.STRING)
                    .list();
            if (checkListEmpty(existList)) {
                for (int i = 0; i < existList.size(); i++) {
                    Object[] arr = (Object[]) existList.get(i);
                    SoSpecializationMasterPojo pojo = new SoSpecializationMasterPojo();
                    pojo.setSpecializationId((Long) arr[0]);
                    pojo.setName((String) arr[1]);
                    pojo.setDescription((String) arr[2]);
                    pojo.setImagePath((String) arr[3]);
                    list.add(pojo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return list;
    }

    public static boolean checkListEmpty(List lis) {
        return (lis == null || lis.isEmpty()) ? false : true;
    }

    private static double distance(double lat1, double lon1, double lat2, double lon2, String unit) {
        if ((lat1 == lat2) && (lon1 == lon2)) {
            return 0;
        } else {
            double theta = lon1 - lon2;
            double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2)) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
            dist = Math.acos(dist);
            dist = Math.toDegrees(dist);
            dist = dist * 60 * 1.1515;
            if (unit.equals("K")) {
                dist = dist * 1.609344;
            } else if (unit.equals("N")) {
                dist = dist * 0.8684;
            }
            return (dist);
        }
    }

    public List<BeanObject> getNearByCities(Double longitude, Double latitude) {
        Session sess = fac.openSession();
        List<BeanObject> list = new ArrayList<>();
        try {
            String query = "select city,longitude,latitude from so_city_lat_long";
            List existList = sess.createSQLQuery(query)
                    .addScalar("city", StandardBasicTypes.STRING)
                    .addScalar("longitude", StandardBasicTypes.DOUBLE)
                    .addScalar("latitude", StandardBasicTypes.DOUBLE)
                    .list();
            if (checkListEmpty(existList)) {
                for (int i = 0; i < existList.size(); i++) {
                    Object[] arr = (Object[]) existList.get(i);
                    BeanObject pojo = new BeanObject();
                    pojo.setStringValue1((String) arr[0]);
                    pojo.setDoubleValue1((Double) arr[1]);
                    pojo.setDoubleValue2((Double) arr[2]);
                    double dist = distance(longitude, latitude, (Double) arr[1], (Double) arr[2], "K");
                    pojo.setDoubleValue3(dist);
                    list.add(pojo);
                }
            }
        } catch (Exception e) {

        }
        return list;
    }

    public List<FilterBean> getFilteredDoctors(List<String> locations, List<Double> ratings, List<Double> yearOfExperience, List<Double> surgery,
            List<Long> specializationId, String sortBy, String searchValue) {
        Session sess = fac.openSession();
        List<FilterBean> list = new ArrayList<>();
        try {
            String query = "select A.*, group_concat(distinct B.display_name) as name,"
                    + " group_concat( distinct C.category_description) as education,group_concat(distinct D.hospital_name) as hosp,"
                    + " (select category_description from so_category_master scm where scm.category_type='TITL' and scm.category_id=A.title) "
                    + " as docTitle from "
                    + " (select doctor_id,doc.first_name,doc.last_name,"
                    + " if(doc.gender='M','Male','Female') as gender,"
                    + " doc.overall_rating, doc.experience, con.mobile_1,con.mail_id,addr.address_1,addr.pincode,cty.city_name,doc.title from"
                    + " so_doctor_master doc, so_address_master addr,  so_contact_master con, so_city cty where doc.doctor_id=addr.user_id"
                    + " and doc.doctor_id=con.user_id and addr.user_type=3 and con.user_type=3 and addr.city=cty.city_id)A left join"
                    + " (select sds.specialization_id,ssm.display_name,sds.doctor_id from so_doctor_specialization sds,"
                    + " so_specialization_master ssm where sds.specialization_id=ssm.specialization_id) B on(A.doctor_id=B.doctor_id)"
                    + " left join (select edu.doctor_id,cat.category_description from so_doctor_degree_association edu, so_category_master cat"
                    + " where edu.degree_id= cat.category_id)C on(A.doctor_id=C.doctor_id) left join"
                    + " (select hospital_name,sdh.doctor_id from so_hospital_master hsm, so_doctor_hospital_association sdh where "
                    + " hsm.hospital_id=sdh.hospital_id) D on(A.doctor_id=D.doctor_id)"
                    + " where (1 = 1) ";
            if (specializationId != null && !specializationId.isEmpty()) {
                query += " and ( ";
                for (Long spec : specializationId) {
                    query += " ifnull(B.specialization_id,0)=" + spec + " or ";
                }
                query += " (1 = 0 ) ) ";
            }

            if (ratings != null && !ratings.isEmpty()) {
                query += "  and ( ";
                for (Double rat : ratings) {
                    query += " ifnull(A.overall_rating,0)>=" + rat + " or ";
                }
                query += " (1 = 0) ) ";
            }

            if (yearOfExperience != null && !yearOfExperience.isEmpty()) {
                query += " and ( ";
                for (Double exp : yearOfExperience) {
                    query += " ifnull(A.experience,0)>=" + exp + " or ";
                }
                query += " (1 = 0) ) ";
            }

            if (locations != null && !locations.isEmpty()) {
                query += "  and ( ";
                for (String city : locations) {
                    query = query + " A.city_name like '%" + city.replace(" ", "%") + "%' or ";
                }
                query += " A.city_name is not null"
                        + ""
                        + " ) ";
            }
            query += " group by A.doctor_id ";

            List existList = sess.createSQLQuery(query)
                    .addScalar("doctor_id", StandardBasicTypes.LONG)
                    .addScalar("first_name", StandardBasicTypes.STRING)
                    .addScalar("last_name", StandardBasicTypes.STRING)
                    .addScalar("gender", StandardBasicTypes.STRING)
                    .addScalar("overall_rating", StandardBasicTypes.DOUBLE)
                    .addScalar("experience", StandardBasicTypes.DOUBLE)
                    .addScalar("mobile_1", StandardBasicTypes.STRING)
                    .addScalar("mail_id", StandardBasicTypes.STRING)
                    .addScalar("address_1", StandardBasicTypes.STRING)
                    .addScalar("pincode", StandardBasicTypes.STRING)
                    .addScalar("city_name", StandardBasicTypes.STRING)
                    .addScalar("name", StandardBasicTypes.STRING)
                    .addScalar("education", StandardBasicTypes.STRING)
                    .addScalar("hosp", StandardBasicTypes.STRING)
                    .addScalar("docTitle", StandardBasicTypes.STRING)
                    .list();
            if (checkListEmpty(existList)) {
                for (int i = 0; i < existList.size(); i++) {
                    Object[] arr = (Object[]) existList.get(i);
                    FilterBean pojo = new FilterBean();
                    pojo.setDoctorId((Long) arr[0]);
                    pojo.setFirstName((String) arr[1]);
                    pojo.setLastName((String) arr[2]);
                    pojo.setGender((String) arr[3]);
                    pojo.setRating((double) arr[4]);
                    pojo.setExperience((double) arr[5]);
                    pojo.setMobile((String) arr[6]);
                    pojo.setEmail((String) arr[7]);
                    pojo.setAddress((String) arr[8]);
                    pojo.setPincode((String) arr[9]);
                    pojo.setCity((String) arr[10]);
                    pojo.setSpecializationName((String) arr[11]);
                    pojo.setEducationalDegrees((String) arr[12]);
                    pojo.setTitle((String)arr[14]);
                    list.add(pojo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return list;
    }
    
    public List<FilterBean> getDoctorDetails(Long doctorId) {
        Session sess = fac.openSession();
        List<FilterBean> list = new ArrayList<>();
        try {
            String query = "select A.*, group_concat(distinct B.display_name) as name,"
                    + " group_concat( distinct C.category_description) as education,group_concat(distinct D.hospital_name) as hosp,"
                    + " (select category_description from so_category_master scm where scm.category_type='TITL' and scm.category_id=A.title) "
                    + " as docTitle from "
                    + " (select doctor_id,doc.first_name,doc.last_name,"
                    + " if(doc.gender='M','Male','Female') as gender,"
                    + " doc.overall_rating, doc.experience, con.mobile_1,con.mail_id,addr.address_1,addr.pincode,cty.city_name,"
                    + " doc.doctor_details, doc.title from "
                    + " so_doctor_master doc, so_address_master addr,  so_contact_master con, so_city cty where doc.doctor_id=addr.user_id"
                    + " and doc.doctor_id=con.user_id and addr.user_type=3 and con.user_type=3 and addr.city=cty.city_id)A left join"
                    + " (select sds.specialization_id,ssm.display_name,sds.doctor_id from so_doctor_specialization sds,"
                    + " so_specialization_master ssm where sds.specialization_id=ssm.specialization_id) B on(A.doctor_id=B.doctor_id)"
                    + " left join (select edu.doctor_id,cat.category_description from so_doctor_degree_association edu, so_category_master cat"
                    + " where edu.degree_id= cat.category_id)C on(A.doctor_id=C.doctor_id) left join"
                    + " (select hospital_name,sdh.doctor_id from so_hospital_master hsm, so_doctor_hospital_association sdh where "
                    + " hsm.hospital_id=sdh.hospital_id) D on(A.doctor_id=D.doctor_id) "
                    + " where  A.doctor_id=:doctorId ";
                
            query += " group by A.doctor_id ";

            List existList = sess.createSQLQuery(query)
                    .addScalar("doctor_id", StandardBasicTypes.LONG)
                    .addScalar("first_name", StandardBasicTypes.STRING)
                    .addScalar("last_name", StandardBasicTypes.STRING)
                    .addScalar("gender", StandardBasicTypes.STRING)
                    .addScalar("overall_rating", StandardBasicTypes.DOUBLE)
                    .addScalar("experience", StandardBasicTypes.DOUBLE)
                    .addScalar("mobile_1", StandardBasicTypes.STRING)
                    .addScalar("mail_id", StandardBasicTypes.STRING)
                    .addScalar("address_1", StandardBasicTypes.STRING)
                    .addScalar("pincode", StandardBasicTypes.STRING)
                    .addScalar("city_name", StandardBasicTypes.STRING)
                    .addScalar("name", StandardBasicTypes.STRING)
                    .addScalar("education", StandardBasicTypes.STRING)
                    .addScalar("hosp", StandardBasicTypes.STRING)
                    .addScalar("docTitle", StandardBasicTypes.STRING)
                    .addScalar("doctor_details", StandardBasicTypes.STRING)
                    .setLong("doctorId", doctorId)
                    .list();
            if (checkListEmpty(existList)) {
                for (int i = 0; i < existList.size(); i++) {
                    Object[] arr = (Object[]) existList.get(i);
                    FilterBean pojo = new FilterBean();
                    pojo.setDoctorId((Long) arr[0]);
                    pojo.setFirstName((String) arr[1]);
                    pojo.setLastName((String) arr[2]);
                    pojo.setGender((String) arr[3]);
                    pojo.setRating((double) arr[4]);
                    pojo.setExperience((double) arr[5]);
                    pojo.setMobile((String) arr[6]);
                    pojo.setEmail((String) arr[7]);
                    pojo.setAddress((String) arr[8]);
                    pojo.setPincode((String) arr[9]);
                    pojo.setCity((String) arr[10]);
                    pojo.setSpecializationName((String) arr[11]);
                    pojo.setEducationalDegrees((String) arr[12]);
                    pojo.setTitle((String)arr[14]);
                    pojo.setDoctorDescription((String)arr[15]);
                    list.add(pojo);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return list;
    }


}
