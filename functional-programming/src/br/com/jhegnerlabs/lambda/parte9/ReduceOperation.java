package br.com.jhegnerlabs.lambda.parte9;

import java.util.stream.IntStream;
import java.util.stream.Stream;

// Terminal operations  that return one value by combining the contents of a stream  are called reduction operations.

public class ReduceOperation {

    public static void main(String[] args) {

        Integer sum = Stream.of(0)
                .peek(e -> System.out.println("##" + e))
                .reduce(50, (a, b) -> a + b);

        System.out.println(sum);
    }

}
