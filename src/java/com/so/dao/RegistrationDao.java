
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dao;

import com.so.pojo.RegPass;
import com.so.util.HiberCon;
import com.so.pojo.SoPatientMasterPojo;
import com.so.pojo.UserRegistration;
import java.sql.Timestamp;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Dell India
 */
public class RegistrationDao {

    private final SessionFactory fac = HiberCon.getSessionFactory();

    public UserRegistration checkUserExists(String userName) {
        Session sess = fac.openSession();
        UserRegistration apReg1 = new UserRegistration();
        try {
            String query = "select count(*) as existCount,tur.user_id,tur.user_type_id,tur.user_name"
                    + " from so_user_registration tur where "
                    + " trim(tur.user_name)='" + userName.trim() + "'";

            List existList = sess.createSQLQuery(query).list();
            if (checkListEmpty(existList)) {
                Object[] arr = (Object[]) existList.get(0);
                if (arr[1] != null) {
                    apReg1.setUserId((Integer) arr[1]);
                    apReg1.setUserTypeId((Integer) arr[2]);
                    apReg1.setUserName((String) arr[3]);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return apReg1;
    }

    public int saveUser(UserRegistration apReg, SoPatientMasterPojo apuReg, RegPass ps, HttpServletRequest req) {
        Session sess = fac.openSession();
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Transaction tx = null;
        try {
            tx = sess.beginTransaction();
            sess.save(apReg);
            apuReg.setCreateAt(ts);
            apuReg.setUpdateAt(ts);
            sess.save(apuReg);
            int pkId1 = apReg.getUserId();
            //int pkId2 = apuReg.getEntityId();

            //cad.setRegisterId(pkId1);
            ps.setRegisterId(pkId1);
            ps.setDateCreated(ts);
            ps.setDateUpdated(ts);
            sess.save(ps);
            //sess.save(cad);
            tx.commit();
        } catch (HibernateException e) {
            if(tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return apReg.getUserId();
    }

    

    public String getUserName(String firstName, String lastName) {
        String query = "";
        Session sess = fac.openSession();
        List lis = null;
        String returnValue = null;
        Object[] arr = null;
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        try {
            query = " select count(*) as existsCount,1 as vall,'" + firstName.trim() + "_" + lastName.trim() + ts.toString() + new Timestamp(System.currentTimeMillis()).toString().substring(20, 23) + "' as new_user "
                    + " from scpd_user_registration where user_name = trim('" + firstName.trim() + "_" + lastName.trim() + "') ";
            lis = sess.createSQLQuery(query).list();
            if (lis != null && lis.size() > 0) {
                arr = (Object[]) lis.get(0);
                returnValue = (String) arr[0];
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
        }
        return returnValue;
    }

    public static boolean checkListEmpty(List lis) {
        return (lis == null || lis.size() == 0) ? false : true;
    }

    public boolean savePojo(Object pojo) {
        Session sess = fac.openSession();
        try {
            sess.beginTransaction().begin();
            sess.save(pojo);
            sess.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sess.close();
        }
        return true;
    }


    public boolean updatePojo(Object pojo) {
        Session sess = fac.openSession();
        try {
            sess.beginTransaction().begin();
            sess.update(pojo);
            sess.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sess.close();
        }
        return true;
    }

}
