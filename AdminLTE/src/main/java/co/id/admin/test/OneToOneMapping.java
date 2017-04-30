/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.test;

import co.id.admin.dao.impl.StockDaoImpl;
import co.id.admin.model.Stock;
import co.id.admin.model.StockDetail;
import java.util.Date;

/**
 *
 * @author gsp
 */
public class OneToOneMapping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        StockDaoImpl stockDaoImpl=new StockDaoImpl();
//        Session session=HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
        Stock stock=new Stock();
        stock.setStockCode("4715");
        stock.setStockName("GENM");
        
        StockDetail stockDetail=new StockDetail();
        stockDetail.setCompName("GENTING MALAYSIA");
        stockDetail.setCompDesc("Best resort in the world");
        stockDetail.setRemark("Nothing special");
        stockDetail.setListedDate(new Date());
        
        stock.setStockDetail(stockDetail);
        stockDetail.setStock(stock);
        
//        session.save(stock);
//        session.getTransaction().commit();;
        stockDaoImpl.addStock(stock);
        System.out.println("Berhasil");
        
    }
    
}
