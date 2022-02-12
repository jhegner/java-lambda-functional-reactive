package br.com.jhegnerlabs.lambda.parte9;

import br.com.jhegnerlabs.lambda.parte9.poc.Funcionario;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelStreams {

    public static void main(String[] args) {

        var funcionarios = new ArrayList<Funcionario>();
        IntStream.range(0, 2000000).forEach(i -> funcionarios.add(new Funcionario(getRandomName(), getRandomSalario())));

        // sequencial
        var startTime = System.currentTimeMillis();
        System.out.println("Processando de forma sequencial: " +
                funcionarios.stream()
                        .filter(ParallelStreams::salarioBaseAumento)
                        .count());
        var endTime = System.currentTimeMillis();
        System.out.println("Tempo do processamento de forma sequencial: " + (endTime - startTime));

        // paralelismo
        startTime = System.currentTimeMillis();
        System.out.println("Processando com paralelismo: " +
                funcionarios.parallelStream()
                        .filter(ParallelStreams::salarioBaseAumento)
                        .count());
        endTime = System.currentTimeMillis();
        System.out.println("Tempo do processamento com paralelismo: " + (endTime - startTime));

    }

    private static boolean salarioBaseAumento(Funcionario e) {
        return e.getSalario().compareTo(BigDecimal.valueOf(2000)) >= 0;
    }

    private static BigDecimal getRandomSalario() {
        return Stream.of(
                BigDecimal.valueOf(2086.00),
                BigDecimal.valueOf(5012.30),
                BigDecimal.valueOf(1582.45),
                BigDecimal.valueOf(2000),
                BigDecimal.valueOf(1000))
                .collect(Collectors.toList()).get(new Random().nextInt(5));
    }

    private static String getRandomName() {

        return Stream.of("Paulo", "Jorge", "Cardoso", "Mateus", "Maria")
                .collect(Collectors.toList()).get(new Random().nextInt(5));
    }

}
