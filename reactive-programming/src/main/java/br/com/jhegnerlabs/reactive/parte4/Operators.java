package br.com.jhegnerlabs.reactive.parte4;

import io.reactivex.rxjava3.core.Observable;

public class Operators {

    public static void main(String[] args) {

        Observable.just(2, 6, 42, 60, 75, 669, 20, 63, 98, 254)
                .filter(e -> e > 75)
                .sorted()
                .subscribe(e -> System.out.println("Valor maior que o filtrado: " + e));

    }

}
