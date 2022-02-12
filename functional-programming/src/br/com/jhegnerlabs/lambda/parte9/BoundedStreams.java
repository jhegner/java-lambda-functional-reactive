package br.com.jhegnerlabs.lambda.parte9;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BoundedStreams {

    public static void main(String[] args) {

        // 1 Collection

        var list = List.of(1, 4, 5, 9, 10);
        var stream = list.stream();
        stream.forEach(System.out::println);

        // Stream on Map
        var map = Map.of(1, "one", 2, "two", 3, "three", 4, "four");
        var entries = map.entrySet().stream();

//        entries.sorted((e1, e2) -> e1.getKey().compareTo(e2.getKey())).forEach(System.out::println);
//        entries.sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).forEach(System.out::println);

//        entries.sorted(Comparator.comparing(Map.Entry::getKey)).forEach(System.out::println);
//        entries.sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);

//        entries.sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        entries.sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

        Stream<String> values = map.values().stream();
        Stream<Integer> keys = map.keySet().stream();

        // 2 Stream class
        Stream<String> stringStream = Stream.of("Hello", "World");

        // 3 stream of Arrays class
        Integer[] integers = {0, 36, 6, 7, 66};
        Stream<Integer> stream1 = Arrays.stream(integers);

        int[] ints = {6, 45, 8, 6, 33,};
        IntStream intStream = Arrays.stream(ints);

        // 4 builder

        Stream.Builder<Integer> builder = Stream.builder();
        Stream<Integer> stream2 = builder.add(4).add(4).add(44).add(4).add(1).add(5).add(2).add(3).build();
        stream2.distinct().sorted().forEach(System.out::println);


    }

}
