package br.com.jhegnerlabs.lambda.parte6.poc;

@FunctionalInterface
public interface Factor<T> {

    T create();

}
