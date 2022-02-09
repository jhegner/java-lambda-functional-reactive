package br.com.jhegnerlabs.lambda.parte1;

public class MinhaPrimeiraLambda {

    public static void main(String[] args) {

        Thread t = new Thread(() -> System.out.println("Thread sendo executada por uma lambda !!!"));
        t.start();

    }

}
