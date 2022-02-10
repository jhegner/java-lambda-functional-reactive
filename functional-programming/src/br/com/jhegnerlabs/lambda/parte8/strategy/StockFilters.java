package br.com.jhegnerlabs.lambda.parte8.strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public class StockFilters {

    public static List<Stock> bySymbol(List<Stock> list, String symbol) {

        var filterData = new LinkedList<Stock>();

        for (Stock stock : list) {

            if (stock.getSymbol().equals(symbol)) {
                filterData.add(stock);
            }
        }

        return filterData;
    }

    public static List<Stock> byPriceAbove(List<Stock> list, double price) {

        var filterData = new LinkedList<Stock>();

        for (Stock stock : list) {
            if (stock.getPrice() > price) {
                filterData.add(stock);
            }
        }
        return filterData;
    }

    public static List<Stock> filter(List<Stock> list, Predicate<Stock> predicate) {

        var filterData = new LinkedList<Stock>();

        for (Stock stock : list) {
            if (predicate.test(stock)) {
                filterData.add(stock);
            }
        }

        return filterData;
    }
}
