package br.com.jhegnerlabs.lambda.parte5;

import java.util.Optional;

public class MoreOperations {

    public static void main(String[] args) {

        // ifPresent

        Optional<String> optional = Optional.of("Hello");
        optional.ifPresent(System.out :: println);
        optional.ifPresent(val -> System.out.println(val.concat(" World")));

        // ifPresentOrElse

        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Hello World 2"));

        // stream
        var stream = optional.stream();
        optional.stream().forEach(System.out :: println);
        Optional.empty().stream().forEach(System.out :: println);
        stream.forEach(e -> System.out.println(e));

        // or
        optional.or(() -> Optional.of("New Value")).ifPresent(System.out :: println);
        Optional.empty().or(() -> Optional.of("New Value")).ifPresent(System.out :: println);

        // equals
        var optional1 = Optional.of("a");
        var optional2 = Optional.of("A");

        System.out.println(optional1.equals(optional2));

        // hashcode
        System.out.println(optional1.hashCode());
        System.out.println(Optional.empty().hashCode());

    }

}
