package br.com.jhegnerlabs.lambda.parte5;

import java.util.Optional;

public class Operations {

    public static void main(String[] args) {

        var optional = Optional.of("Hello");

        // map

        var optionalTransform = optional.map(e -> "World");
        var optionalTransform2 = optional.map("World "::concat);

        System.out.println(optionalTransform.orElse("Hello World"));
        System.out.println(optionalTransform2.get());

        // filter

        var optionalReturn = optional.filter(val -> val.contains("ll"));
        System.out.println(optionalReturn.get());

        // flatMap

        var optionalReturn2 = optional.flatMap(val -> Optional.of("Replaced By flatMap"));
        System.out.println(optionalReturn2.get());
    }

}
