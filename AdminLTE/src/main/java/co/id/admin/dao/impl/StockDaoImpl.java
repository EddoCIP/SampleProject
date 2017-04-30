/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.dao.impl;

import co.id.admin.connection.HibernateUtil;
import co.id.admin.dao.StockDao;
import co.id.admin.model.Stock;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gsp
 */
public class StockDaoImpl implements StockDao {

    @Override
    public void addStock(Stock stock) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(stock);
            session.getTransaction().commit();
        } catch (RuntimeException e) {
            if (trns != null) {
                trns.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }

}
