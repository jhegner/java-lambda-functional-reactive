package br.com.jhegnerlabs.reactive.parte5;

import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class ZipAndCombineLatest {

    public static void main(String[] args) throws InterruptedException {

        Observable<Long> src2 = Observable.interval(200, TimeUnit.MILLISECONDS);

        Observable<Long> src1 = Observable.interval(1, TimeUnit.SECONDS);

//        Observable.zip(src1, src2, (e1, e2) -> "Source1: " + e1 + " Source2: " + e2)
        Observable.combineLatest(src1, src2, (e1, e2) -> "Source1: " + e1 + " Source2: " + e2)
                .subscribe(System.out::println);

        Thread.sleep(20000);
    }

}
