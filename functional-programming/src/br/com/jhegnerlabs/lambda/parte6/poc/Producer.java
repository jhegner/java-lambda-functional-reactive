package br.com.jhegnerlabs.lambda.parte6.poc;

@FunctionalInterface
public interface Producer<T> {

    T produce();
}
