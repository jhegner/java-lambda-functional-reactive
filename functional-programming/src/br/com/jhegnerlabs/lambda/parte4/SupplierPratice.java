package br.com.jhegnerlabs.lambda.parte4;

import java.util.function.Supplier;

public class SupplierPratice {

    public static void main(String[] args) {

        Supplier<String> stringSupplier = () -> "Ola";

        System.out.println(stringSupplier.get());

        Supplier<Double> randomNumber = Math :: random;

        System.out.println(randomNumber.get());

    }

}
