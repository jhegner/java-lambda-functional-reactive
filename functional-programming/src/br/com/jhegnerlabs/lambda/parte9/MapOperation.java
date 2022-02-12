package br.com.jhegnerlabs.lambda.parte9;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapOperation {

    public static void main(String[] args) {

        Function<Integer, Integer> function = e -> e * 2;

        var result= Stream.of(1,2,3,4,5,6,7,8,9,10)
                .map(function)
                .collect(Collectors.toList());

        System.out.println(result);


        for (int i = 0; i < 10; i++) {

            resultado(i);

        }

    }

    private static void resultado(final Integer valor){

        BiFunction<Integer, Integer, Integer> biFunction
                = (oper1, oper2) -> oper1 * oper2;

        var result2= IntStream.range(1, 11)
                .map(e -> biFunction.apply(e, valor)).toArray();

        for (int i : result2) {
            System.out.print(i);
        }
        System.out.println("");

    }

}
