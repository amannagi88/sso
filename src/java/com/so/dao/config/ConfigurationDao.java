/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dao.config;

import com.so.beans.LicenseBean;
import com.so.util.HiberCon;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author Dell India
 */
public class ConfigurationDao {

    private final SessionFactory fac = HiberCon.getSessionFactory();

    public List getConfigurationByClientId(String type, int clientId, String fetch, String dummy2) {
        Session sess = fac.openSession();
        List l2 = new ArrayList();
        List l1 = null;
        String sql = "";
        String table = "";
        String active = "STATUS";
        Object arr[] = null;
        LicenseBean bean = null;
        //if clientId = 0 then fetch common set up else already done set up 
        try {
            switch (type.toUpperCase()) {                
                case "DOC":
                    table = "so_doctor_config";
                    break;
                case "EMP":
                    table = "VM_VENDOR_CONFIG";
                    break;
            }

            sql = "select lc.serial_no,lc.field_type,lc.field_name,\n"
                    + " lc.field_desc,lc.is_applicable,lc.is_disabled,\n"
                    + " lc.is_mandatory,lc.is_name_editable,lc.order_no,lc.field_1 as encEligible,"
                    + " ifnull((select max(order_no) from " + table + " lc1 where lc1.client_id=lc.client_id and lc1." + active + "=1),0) as  maxOrder, "
                    + " if(lc.client_id=0,0,1) as saved"
                    + " from " + table + " lc where lc." + active + "=1\n"
                    + " order by ifnull(lc.field_1,0),lc.order_no asc ";
            
            l1 = sess.createSQLQuery(sql)
                    .addScalar("serial_no", StandardBasicTypes.INTEGER)//0
                    .addScalar("field_type", StandardBasicTypes.INTEGER)//1
                    .addScalar("field_name", StandardBasicTypes.STRING)//2
                    .addScalar("field_desc", StandardBasicTypes.STRING)//3
                    .addScalar("is_applicable", StandardBasicTypes.INTEGER)//4
                    .addScalar("is_disabled", StandardBasicTypes.INTEGER)//5
                    .addScalar("is_mandatory", StandardBasicTypes.INTEGER)//6
                    .addScalar("is_name_editable", StandardBasicTypes.INTEGER)//7
                    .addScalar("order_no", StandardBasicTypes.DOUBLE)//8
                    .addScalar("encEligible", StandardBasicTypes.INTEGER)//9//field 1 is as enc applicable in user and in customer for sections
                    .addScalar("maxOrder", StandardBasicTypes.INTEGER)//10
                    .addScalar("saved", StandardBasicTypes.INTEGER)//11
                    .setInteger("clientId", clientId)
                    .list();
            if (l1 != null && l1.size() > 0) {
                for (int i = 0; i < l1.size(); i++) {
                    arr = (Object[]) l1.get(i);
                    bean = new LicenseBean();
                    bean.setCount(i + 1);
                    bean.setSerialNo((Integer) arr[0]);
                    bean.setFieldType((Integer) arr[1]);
                    bean.setFieldName((String) arr[2]);
                    bean.setFieldDesc((String) arr[3]);
                    bean.setIsApplicable((Integer) arr[4]);
                    bean.setIsDisabled((Integer) arr[5]);
                    bean.setIsMandatory((Integer) arr[6]);
                    bean.setIsNameEditable((Integer) arr[7]);
                    bean.setOrderNo((Double) arr[8]);
                    bean.setField1((Integer) arr[9]);//section no
                    bean.setField2((Integer) arr[10]);//max order no
                    bean.setField3((Integer) arr[11]);//1 is saved and 0 is not saved
                    l2.add(bean);
                    bean = null;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sess.close();
            bean = null;
            sql = null;
            arr = null;
            table = null;
            active = null;
        }

        return l2;
    }

}
