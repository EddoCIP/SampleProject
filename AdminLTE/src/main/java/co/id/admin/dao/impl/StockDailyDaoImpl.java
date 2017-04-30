/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.dao.impl;

import co.id.admin.connection.HibernateUtil;
import co.id.admin.dao.StockDailyDao;
import co.id.admin.model.StockDaily;
import co.id.admin.model.StockDailyRecord;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gsp
 */
public class StockDailyDaoImpl implements StockDailyDao {

    @Override
    public void addStock(StockDaily stock, StockDailyRecord stockDailyRecord) {
        Transaction trns = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            trns = session.beginTransaction();
            session.save(stock);
            session.save(stockDailyRecord);
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
