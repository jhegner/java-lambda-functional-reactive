package br.com.jhegnerlabs.lambda.parte2;

import java.util.stream.IntStream;

public class ImperativeVsDeclarative {

    public static void main(String[] args) {

        // Paradigma Imperativo

        int somaDePares = 0;

        for(int i = 0; i <= 100; i++) {

            if(i % 2 == 0)  {
                somaDePares += i;
            }
        }

        System.out.println(somaDePares);

        // Paradigma Declarativo ou Funcional

        somaDePares = IntStream.rangeClosed(0, 100)
                .filter(i -> i % 2 == 0)
                .reduce((x, y) -> x + y)
                .getAsInt();

        System.out.println(somaDePares);
    }

}
