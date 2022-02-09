package br.com.jhegnerlabs.lambda.parte4;

import java.util.function.BiFunction;

public class BiFunctionPractice {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction1 =
                (a, b) -> a + " " + b;

        System.out.println(biFunction1.apply("Hello", "World"));

        BiFunction<String, String, Integer> biFunction2 =
                (a, b) -> (a + " " + b).length();

        System.out.println(biFunction2.apply("Hello", "World"));

    }

}
