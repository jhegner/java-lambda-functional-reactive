package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.core.Observable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreatingObservable {

    public static void main(String[] args) throws InterruptedException {

//        // create
//        Observable<Integer> source = Observable.create(o -> {
//
//            o.onNext(10);
//            o.onNext(11);
//            o.onNext(12);
//
//            o.onComplete();
//        });
//
//        source.subscribe(System.out::println);
//
//        // just
//        Observable<Integer> just = Observable.just(1, 2, 3);
//        just.subscribe(System.out::println);
//
//        // fromIterable
//        var fromIterable = Observable.fromIterable(
//                List.of("Hello", "World", "Java")
//        );
//        fromIterable.subscribe(System.out::println);
//
//        // range
//        var rangeObserver = Observable.range(3, 5)
//                .subscribe((s) -> System.out.println("RECEBIDO: " + s));
//
//        // interval
//        var intervalObserver = Observable
//                .interval(1000, TimeUnit.MILLISECONDS)
//                .subscribe((s) -> System.out.println("Ola"));
//        Thread.sleep(5000);

        // future

        // empty

        // never

        // error

        // defer

        List<String> list = new ArrayList<>();
        list.add("Leo");
        list.add("Kim");
        list.add("Cleo");

        var deferObservable = Observable.defer(
                () -> Observable.fromIterable(list)
        );
        deferObservable.subscribe(System.out :: println);

//        list.add("Mike");
//        list.remove("Kim");

        list.clear();

        System.out.println("");

        deferObservable.subscribe((e) -> System.out.println("Print" + e));

    }
}
