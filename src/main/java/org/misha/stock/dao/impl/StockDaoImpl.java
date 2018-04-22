package org.misha.stock.dao.impl;

import org.misha.stock.dao.StockDao;
import org.misha.stock.model.Stock;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


public class StockDaoImpl extends HibernateDaoSupport implements StockDao {

    public void save(final Stock stock) {
        getHibernateTemplate().save(stock);
    }

    public void update(final Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(final Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(final String stockCode) {
        return (Stock) getHibernateTemplate().find("from Stock where stockCode= ?", stockCode).get(0);
    }
}
