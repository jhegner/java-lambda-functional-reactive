package br.com.jhegnerlabs.lambda.parte8;

import java.util.ArrayList;
import java.util.List;

public class StrategyPattern {

    public static void main(String[] args) {

        List<Stock> stockList = new ArrayList<>();

        stockList.add(new Stock("AAPL", 21.65,20));
        stockList.add(new Stock("FFSC", 42,15));
        stockList.add(new Stock("AMZ", 22.35,1));
        stockList.add(new Stock("SDGF", 22.35,1));
        stockList.add(new Stock("Google", 333.69,5));
        stockList.add(new Stock("AAPL", 33,10));
        stockList.add(new Stock("FFSCC", 65.65,30));
        stockList.add(new Stock("AMZ", 20.6,340));

        StockFilters.bySymbol(stockList, "FFSC").forEach(System.out::println);
        StockFilters.byPriceAbove(stockList, 200).forEach(System.out::println);

        StockFilters.filter(stockList, stock -> stock.getSymbol().equals("AMZ")).forEach(System.out::println);

        stockList.stream().filter(stock -> stock.getSymbol().equals("AMZ")).forEach(System.out::println);

    }

}
