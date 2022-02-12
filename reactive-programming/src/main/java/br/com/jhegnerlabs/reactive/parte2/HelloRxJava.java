package br.com.jhegnerlabs.reactive.parte2;

import io.reactivex.rxjava3.core.Observable;

public class HelloRxJava {

    public static void main(String[] args) throws InterruptedException {

        Observable<String> source = Observable.create(
                e -> {
                    e.onNext("Hello");
                    e.onNext("RxJava");
                }
        );

        var result1 = source.subscribe((e) -> System.out.println("Observer 1:" + e));

        var result2 = source.subscribe(e -> System.out.println("Observer 2: " + e));

    }

}
