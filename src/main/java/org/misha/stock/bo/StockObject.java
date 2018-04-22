package org.misha.stock.bo;

import org.misha.stock.model.Stock;

public interface StockObject {

    void save(Stock stock);

    void update(Stock stock);

    void delete(Stock stock);

    Stock findByStockCode(String stockCode);
}
