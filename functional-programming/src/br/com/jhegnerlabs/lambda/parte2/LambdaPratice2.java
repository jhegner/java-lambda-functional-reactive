package br.com.jhegnerlabs.lambda.parte2;

public class LambdaPratice2 {

    public static void main(String[] args) {

        MathOperaction add = (a, b) -> System.out.println(a + b);
        add.operaiton(10, 5);

        MathOperaction multiply = (a, b) -> System.out.println(a * b);
        add.operaiton(10, 5);

    }
}
