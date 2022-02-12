package br.com.jhegnerlabs.lambda.parte9;

import java.util.Random;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {

//        Stream.iterate(5, i -> i+1)
//                .limit(100)
//                .forEach(System.out::println);

//        Stream.generate(() -> "Hello")
//                .forEach(System.out::println);

        Stream.generate(new Random() :: nextInt)
                .limit(200)
                .forEach(System.out::println);

    }

}
