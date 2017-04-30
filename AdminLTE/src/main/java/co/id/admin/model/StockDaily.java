/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author gsp
 */
public class StockDaily {

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private Set<StockDailyRecord> stockDailyRecord = new HashSet<StockDailyRecord>(0);

    public StockDaily() {
    }

    public Integer getStockId() {
        return stockId;
    }

    public void setStockId(Integer stockId) {
        this.stockId = stockId;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public Set<StockDailyRecord> getStockDailyRecord() {
        return stockDailyRecord;
    }

    public void setStockDailyRecord(Set<StockDailyRecord> stockDailyRecord) {
        this.stockDailyRecord = stockDailyRecord;
    }

}
