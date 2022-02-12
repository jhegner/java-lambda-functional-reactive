package br.com.jhegnerlabs.lambda.parte9;

import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOperation {


    public static void main(String[] args) {

        Predicate<Integer> filtroNumerosPositivos = (num) -> num > 0;

        var result= Stream.of(34, 32, 0, 544, 58, -4, 58, 663, 1000, -48)
                .filter(filtroNumerosPositivos)
                .sorted().collect(Collectors.toList());

        System.out.println(result);

    }

}
