package br.com.jhegnerlabs.lambda.parte5;

import java.util.Optional;

public class Unwrap {

    public static void main(String[] args) {

        Integer i = 10;
        Optional<Integer> optional = Optional.of(i);

        Integer integerVal = optional.get();

        System.out.println(integerVal);

        // sem elementos

        Optional<Integer> emptyOptional = Optional.empty();
//        emptyOptional.get();

        // isPresent
        Integer val = emptyOptional.isPresent() ? emptyOptional.get() : 0;
        System.out.println(val);

        // orElse, orElseGet
        var orElse = emptyOptional.orElse(20);
        var orElseGet = emptyOptional.orElseGet(() -> 2);
        System.out.println(orElse);
        System.out.println(orElseGet);

        // orElseThrow
        emptyOptional.orElseThrow(IllegalArgumentException::new);

    }

}
