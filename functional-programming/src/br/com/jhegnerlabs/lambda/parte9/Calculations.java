package br.com.jhegnerlabs.lambda.parte9;

import java.util.stream.IntStream;

public class Calculations {

    public static void main(String[] args) {

        // sum
        var sum = IntStream.range(0, 6).sum();
        System.out.println(sum);

        // max
        var max = IntStream.range(0, 6).max();
        System.out.println(max.orElse(0));

        // min
        var min = IntStream.range(0, 6).min();
        System.out.println(min.orElse(0));

        // average
        var average = IntStream.range(0, 6).average();
        System.out.println(average.orElse(0));

        // summary statistics
        var summaryStatistics = IntStream.range(0, 6).summaryStatistics();
        System.out.println(summaryStatistics);

    }

}
