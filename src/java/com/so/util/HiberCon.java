/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.so.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

/**
 *
 * @author SLS-004-COR-GGN
 */
public class HiberCon {

    private static SessionFactory factory;

    public static SessionFactory getSessionFactory() {
        try {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
            factory = cfg.buildSessionFactory(serviceRegistry);
            cfg = null;
        } catch (Exception ee) {
            ee.printStackTrace();
        }
        return factory;
    }

}
