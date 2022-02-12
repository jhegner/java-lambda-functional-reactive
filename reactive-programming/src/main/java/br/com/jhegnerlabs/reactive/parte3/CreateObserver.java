package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.core.Observable;

public class CreateObserver {

    public static void main(String[] args) {

        Observable<String> source = Observable.just("Green", "Black", "Red");

        source.subscribe(
                i -> System.out.println(i),
                Throwable::printStackTrace,
                () -> System.out.println("Completed!!!"));

        System.out.println();

        source.subscribe(
                i -> System.out.println(i),
                Throwable::printStackTrace);

        System.out.println();

        source.subscribe(
                i -> System.out.println(i));
    }

}
