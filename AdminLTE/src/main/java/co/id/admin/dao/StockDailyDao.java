/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.dao;

import co.id.admin.model.StockDaily;
import co.id.admin.model.StockDailyRecord;

/**
 *
 * @author gsp
 */
public interface StockDailyDao {
      public void addStock(StockDaily stock, StockDailyRecord stockDailyRecord); 
}
