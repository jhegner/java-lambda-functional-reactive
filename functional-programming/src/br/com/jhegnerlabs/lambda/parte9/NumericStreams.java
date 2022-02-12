package br.com.jhegnerlabs.lambda.parte9;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class NumericStreams {

    public static void main(String[] args) {

        var livros = List.of(
                new Livro("Um passeio no parque", new Autor("Claudio"), "Comedia", 5.5),
                new Livro("Outro passeio no parque", new Autor("Claudio"), "Drama", 2.00),
                new Livro("Outro passeio no parque", new Autor("Claudio"), "Comedia", 1.00),
                new Livro("Outro passeio no parque", new Autor("Claudio"), "Ficcao", 2.00),
                new Livro("Outro passeio no parque", new Autor("Claudio"), "Comedia", 33.00),
                new Livro("Outro passeio no parque", new Autor("Claudio"), "Ficcao", 2.00)
        );

        OptionalDouble media = livros.stream()
                .map(Livro::getAvaliacao)
                .sorted()
                .peek(System.out::println)
                .mapToDouble(avaliacao -> avaliacao)
                .average();

        System.out.println(media);

        // outros
        IntStream intStream = IntStream.of(1, 2, 3);
        DoubleStream doubleStream = DoubleStream.of(1, 3, 0.5, 2);
        LongStream longStream = LongStream.of(1L, 3L, 4L);

        Stream<Integer> boxed = intStream.boxed();
        boxed.forEach(System.out::println);

    }

}
