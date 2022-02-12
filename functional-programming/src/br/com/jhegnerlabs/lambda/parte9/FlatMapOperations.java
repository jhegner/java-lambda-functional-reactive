package br.com.jhegnerlabs.lambda.parte9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapOperations {

    public static void main(String[] args) {

        Stream<String> a = Stream.of("Hello", "World");
        Stream<String> b = Stream.of("Learning", "Java");

        Stream<Stream<String>> of = Stream.of(a, b);

        var stream = Stream.of(a, b)
                .flatMap(e -> e);
        stream.forEach(e -> System.out.println("###" + e));

        var path = Paths.get(
                "D:\\Cursos\\java-lambda-functional-reactive\\functional-programming\\src\\br\\com\\jhegnerlabs\\lambda\\parte9\\Notes.txt");
        try(Stream<String> notes = Files.lines(path)) {

            var palavrasColetadas = notes
                    .flatMap(lines -> Arrays.stream(lines.split("\\.")))
                    .collect(Collectors.toList());

            palavrasColetadas.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
