package br.com.jhegnerlabs.lambda.parte9;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIntroduction {

    public static void main(String[] args) {

        List<Livro> livros = List.of(
                new Livro(
                        "Um passeio no parque",
                        new Autor("Claudio"),
                        "Comedia",
                        20.00),
                new Livro(
                        "Outro passeio no parque",
                        new Autor("Claudio"),
                        "Drama",
                        2.00),
                new Livro(
                        "Outro passeio no parque",
                        new Autor("Claudio"),
                        "Comedia",
                        1.00),
                new Livro(
                        "Outro passeio no parque",
                        new Autor("Claudio"),
                        "Ficcao",
                        2.00),
                new Livro(
                        "Outro passeio no parque",
                        new Autor("Claudio"),
                        "Comedia",
                        33.00),
                new Livro(
                        "Outro passeio no parque",
                        new Autor("Claudio"),
                        "Ficcao",
                        2.00)
        );

        var livrosFiltrados = livros.parallelStream()
                .filter(e -> e.getGenero().equalsIgnoreCase("Ficcao"))
                .filter(e -> e.getAvaliacao() <= 2)
                .collect(Collectors.toList());

        // Error

        Stream<Livro> stream1 = livros.stream();
        var stream2 = stream1.filter(e -> e.getGenero().equalsIgnoreCase("Ficcao"));
        var result = stream2.collect(Collectors.toList());

        System.out.println(result);

        var stream3 = stream2.filter(e -> e.getAvaliacao() <= 2).collect(Collectors.toList());
        System.out.println(stream3);

    }

}
