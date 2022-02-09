package br.com.jhegnerlabs.lambda.parte4;

import java.util.function.BiFunction;

public class StaticReference {

    public static void main(String[] args) {

        BiFunction<String, String, String> biFunction =
                A_Class :: staticMethod;

        System.out.println(biFunction.apply("Hello", "World"));

    }

}

class A_Class{
    static String staticMethod(String a, String b) {
        return a + b;
    }
}
