package org.misha.stock.bo.impl;

import org.misha.stock.bo.StockObject;
import org.misha.stock.dao.StockDao;
import org.misha.stock.model.Stock;

public class StockBoImpl implements StockObject {

    private StockDao stockDao;

    public void setStockDao(StockDao stockDao) {
        this.stockDao = stockDao;
    }

    public void save(Stock stock) {
        stockDao.save(stock);
    }

    public void update(Stock stock) {
        stockDao.update(stock);
    }

    public void delete(Stock stock) {
        stockDao.delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        return stockDao.findByStockCode(stockCode);
    }
}
