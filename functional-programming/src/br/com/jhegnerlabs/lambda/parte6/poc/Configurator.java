package br.com.jhegnerlabs.lambda.parte6.poc;

@FunctionalInterface
public interface Configurator<T,R> {

    R configure(T t);

}
