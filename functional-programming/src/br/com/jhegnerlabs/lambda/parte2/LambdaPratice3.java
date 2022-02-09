package br.com.jhegnerlabs.lambda.parte2;

public class LambdaPratice3 {

    public static void main(String[] args) {

//        LengthOfString len = str -> str.length();
//
//        var length = len.length("Texto");
//
//        System.out.println(length);

        LengthOfString len = str -> {

            var l = str.length();

            System.out.println("O Tamanho de uma spring fornecida " + l);

            return l;
        };

        var length = len.length("Basic Strong");
        System.out.println(length);

    }
}
