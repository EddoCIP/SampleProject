/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.test;

import co.id.admin.connection.HibernateUtil;
import co.id.admin.dao.impl.StockDailyDaoImpl;
import co.id.admin.model.StockDaily;
import co.id.admin.model.StockDailyRecord;
import java.util.Date;
import org.hibernate.Session;

/**
 *
 * @author gsp
 */
public class OneToManyMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        StockDailyDaoImpl stockDailyDaoImpl=new StockDailyDaoImpl();
//        
//        StockDaily stockDaily=new StockDaily();
//        StockDailyRecord stockDailyRecord=new StockDailyRecord();
//        
//         stockDaily.setStockCode("7052");
//         stockDaily.setStockName("PADINI");
//         
//        stockDailyRecord.setPriceOpen(new Float("1.2"));
//        stockDailyRecord.setPriceClose(new Float("1.1"));
//        stockDailyRecord.setPriceChange(new Float("10.0"));
//        stockDailyRecord.setVolume(3000000L);
//        stockDailyRecord.setDate(new Date());

        System.out.println("Hibernate one to many (XML Mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();

	StockDaily stock = new StockDaily();
        stock.setStockCode("7052");
        stock.setStockName("PADINI");
        session.save(stock);

        StockDailyRecord stockDailyRecords = new StockDailyRecord();
        stockDailyRecords.setPriceOpen(new Float("1.2"));
        stockDailyRecords.setPriceClose(new Float("1.1"));
        stockDailyRecords.setPriceChange(new Float("10.0"));
        stockDailyRecords.setVolume(3000000L);
        stockDailyRecords.setDate(new Date());
        //SET STOCK KE STOCKDAILYRECORD
        stockDailyRecords.setStockDaily(stock);
        //set stockdailyrecord ke stock 
        stock.getStockDailyRecord().add(stockDailyRecords);

        session.save(stockDailyRecords);

	session.getTransaction().commit();
	System.out.println("Done");
        
    }
    
}
