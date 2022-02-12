package br.com.jhegnerlabs.reactive.parte3;

import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.core.ObservableEmitter;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.operators.observable.ObservableCreate;

public class ObservableAndObserver {

    public static void main(String[] args) {

        ObservableCreate<Integer> source = new ObservableCreate<>(new ObservableOnSubscribe<Integer>() {

            @Override
            public void subscribe(@NonNull ObservableEmitter<Integer> emitter) throws Throwable {

                try {
                    emitter.onNext(10);
                    emitter.onNext(11);
                    emitter.onComplete();
                } catch (Throwable t) {
                    emitter.onError(t);
                }
            }
        });

        Observer<Integer> observer = new Observer<Integer>() {

            @Override
            public void onSubscribe(@NonNull Disposable d) {
                System.out.println("Subscribed");
            }

            @Override
            public void onNext(@NonNull Integer integer) {
                System.out.println("On Next: " + integer);
            }

            @Override
            public void onError(@NonNull Throwable e) {
                e.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Completed!!!");
            }
        };

        source.subscribe(observer);

    }

}
