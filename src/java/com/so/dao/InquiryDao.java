
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.dao;

import com.so.pojo.SoInquiryPojo;
import com.so.util.HiberCon;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author Dell India
 */
public class InquiryDao {

    private final SessionFactory fac = HiberCon.getSessionFactory();

    public static boolean checkListEmpty(List lis) {
        return (lis == null || lis.size() == 0) ? false : true;
    }

    public boolean savePojo(Object pojo) {
        Session sess = fac.openSession();
        Transaction tx = null;
        try {
            tx = sess.beginTransaction();            
            sess.save(pojo);
            tx.commit();
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
        Transaction tx = null;
        try {
            tx = sess.beginTransaction();     
            sess.update(pojo);
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            sess.close();
        }
        return true;
    }

}
