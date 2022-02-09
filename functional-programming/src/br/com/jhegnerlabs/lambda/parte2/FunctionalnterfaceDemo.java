package br.com.jhegnerlabs.lambda.parte2;

import java.util.List;

public class FunctionalnterfaceDemo {

    public static void main(String[] args) {

//        MyFunInterface myFunInterface = () -> System.out.println("Hello !!!");
//        myFunInterface.myMethod();

//        onTheFly(() -> System.out.println("Hello"));

//        onTheFly(() -> List.of("Objeto 1", "Objeto 2", "Objeto 3").forEach(obj -> System.out.println(obj)));

        onTheFly(() -> List.of("Objeto 1", "Objeto 2", "Objeto 3").forEach(System.out::println));

    }

    public static void onTheFly(MyFunctionalInterface funInterface) {
        funInterface.myMethod();
    }

}
