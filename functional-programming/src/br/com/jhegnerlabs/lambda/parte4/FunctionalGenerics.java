package br.com.jhegnerlabs.lambda.parte4;

@FunctionalInterface
public interface FunctionalGenerics<T, R> {

    R execute(T t);

}
