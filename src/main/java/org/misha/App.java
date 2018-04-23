package org.misha;

import org.apache.commons.lang3.RandomStringUtils;
import org.misha.stock.bo.StockObject;
import org.misha.stock.model.Stock;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final String CONFIG_LOCATION = "spring/config/BeanLocations.xml";

    public static void main(String[] args) {
        final StockObject
                stockObject = (StockObject) new ClassPathXmlApplicationContext(CONFIG_LOCATION).getBean("stockBo");
        // insert
        final String stockCode = RandomStringUtils.randomNumeric(5);
        final String stockName = RandomStringUtils.randomAlphabetic(5);
        final Stock stock = new Stock(stockCode, stockName);
        stockObject.save(stock);
        // select
        Stock stock2 = stockObject.findByStockCode(stockCode);
        System.out.println(stock2);
        // update
        stock2.setStockName("HAIO-1");
        stockObject.update(stock2);
        //delete
        stockObject.delete(stock2);
        System.out.println("Done");
    }
}
