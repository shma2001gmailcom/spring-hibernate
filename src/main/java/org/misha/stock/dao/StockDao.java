package org.misha.stock.dao;

import org.misha.stock.model.Stock;

public interface StockDao {

    void save(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}
