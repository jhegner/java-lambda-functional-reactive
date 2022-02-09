package br.com.jhegnerlabs.lambda.parte5;

import java.util.Optional;

public class OptionalCreation {

    public static void main(String[] args) {

        String val = "Hello";

        Optional<String> optional = Optional.of(val);

        Optional<Integer> empty = Optional.empty();

        Optional<String> nullable = Optional.ofNullable(val);
        Optional<String> emptyOptional = Optional.ofNullable(null);


    }

}
