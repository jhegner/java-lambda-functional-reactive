package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.List;

public class ColdObservables {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(16);
        list.add(6);
        list.add(25);
        list.add(2568);

        Observable<Integer> source = Observable.fromIterable(list);
        source.subscribe(System.out::println);

        System.out.println("");

        getData(list);

        source.subscribe(System.out::println);
    }

    private static List<Integer> getData(List<Integer> list) {
        list.add(69);
        return list;
    }

}
