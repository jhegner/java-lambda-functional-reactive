package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

public class Variants {

    public static void main(String[] args) {

        // Single

        Observable<String> source = Observable.just("Alex", "Justin", "Leo");
//        Observable<String> source = Observable.empty();
        source.first("Name")
                .subscribe(System.out::println);

        Single.just("Alexx")
                .subscribe((e) -> System.out.println(e));

        // Maybe
        source.firstElement()
                .subscribe(System.out::println);

//        Maybe.just(null)
        Maybe.just("Fulano de Tal")
                .subscribe(System.out::println);

        Completable completable = Completable.complete();
        System.out.println();
        completable.subscribe(() -> System.out.println("Completed"));

        Completable
                .fromRunnable(() -> System.out.println("Algum processo executando"))
                .subscribe(() -> System.out.println("The process succesfully"));

    }

}
