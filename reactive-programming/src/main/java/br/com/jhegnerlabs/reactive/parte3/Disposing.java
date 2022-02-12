package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

import java.util.concurrent.TimeUnit;

public class Disposing {

    private static final CompositeDisposable disp = new CompositeDisposable();

    public static void main(String[] args) throws InterruptedException {

        @NonNull
        var src = Observable.interval(1, TimeUnit.SECONDS);

//        var disposable = src.subscribe(e -> System.out.println("Obs 1: " + e));
//        src.subscribe(e -> System.out.println("Obs 1: " + e)).dispose();

//        Thread.sleep(5000);
//        disposable.dispose();

//        src.subscribe(e -> System.out.println("Obs 2: " + e));

//        Thread.sleep(10000);

        var disposable1 = src.subscribe(e -> System.out.println("Obs 1: " + e));
        var disposable2 = src.subscribe(e -> System.out.println("Obs 2: " + e));

        Thread.sleep(5000);

        disp.addAll(disposable1, disposable2);
        disp.dispose();

        Thread.sleep(10000);
    }

}
