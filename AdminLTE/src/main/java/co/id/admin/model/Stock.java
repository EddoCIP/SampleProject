/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.admin.model;

import java.io.Serializable;

/**
 *
 * @author gsp
 */
public class Stock implements Serializable {

    private Integer stockId;
    private String stockCode;
    private String stockName;
    private StockDetail stockDetail;

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

    public StockDetail getStockDetail() {
        return stockDetail;
    }

    public void setStockDetail(StockDetail stockDetail) {
        this.stockDetail = stockDetail;
    }

    @Override
    public String toString() {
        return "Stock{" + "stockId=" + stockId + ", stockCode=" + stockCode + ", stockName=" + stockName + ", stockDetail=" + stockDetail + '}';
    }

}
