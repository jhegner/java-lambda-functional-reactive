package br.com.jhegnerlabs.reactive.parte5;

import io.reactivex.rxjava3.core.Observable;

import java.util.List;

public class FlatMapConcatMap {

    public static void main(String[] args) {
        var list = List.of("Hello", "Reactive", "Programming");

        Observable.fromIterable(list)
//                .flatMap(e -> Observable.fromArray(e.split("")))
                .concatMap(e -> Observable.fromArray(e.split("")))
                .subscribe(System.out::println);
    }

}
