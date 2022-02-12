package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.core.Observable;

import java.util.concurrent.TimeUnit;

public class ConnectableObservable {

    // hot
    public static void main(String[] args) throws InterruptedException {

        var source = Observable.interval(1, TimeUnit.SECONDS).publish();

//        io.reactivex.rxjava3.observables.@NonNull ConnectableObservable<@NonNull Long> source
//                = Observable.interval(1, TimeUnit.SECONDS).publish();

        source.connect();

        source.subscribe(System.out::println);

        Thread.sleep(10000);

        source.subscribe(System.out::println);

        Thread.sleep(10000);
    }
}
