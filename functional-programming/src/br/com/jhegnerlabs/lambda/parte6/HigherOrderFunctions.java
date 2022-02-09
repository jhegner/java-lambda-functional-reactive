package br.com.jhegnerlabs.lambda.parte6;

import br.com.jhegnerlabs.lambda.parte6.poc.Configurator;
import br.com.jhegnerlabs.lambda.parte6.poc.Factor;
import br.com.jhegnerlabs.lambda.parte6.poc.Producer;

public class HigherOrderFunctions {

    public static void main(String[] args) {

        var random = Math.random() * 100;

        var cf = createFactory(() -> random, Double::intValue);
        var product = cf.create();
        System.out.println(product);

    }

    public static <T,R> Factor<R> createFactory(Producer<T> producer, Configurator<T,R> configurator) {
        return () -> {
            T product = producer.produce();
            return configurator.configure(product);
        };
    }

    public static double intValue(double val) {
        return (int) val;
    }
}
