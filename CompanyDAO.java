/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import java.util.ArrayList;
import java.util.List;
import model.pojo.Company;
import model.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author acer
 */
public class CompanyDAO {
    public static List<Company> layDS(){
        List<Company> list = new ArrayList<>();
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            
            String hql = "from Company";
            Query q = session.createQuery(hql);
            
            list = q.list();
            
            
            session.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
