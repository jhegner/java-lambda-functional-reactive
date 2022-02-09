package br.com.jhegnerlabs.lambda.parte6;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<T> {

    void accept(T t);

    default Consumer<T> thenAccpet(Consumer<T> next) {

        Objects.requireNonNull(next);

        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
