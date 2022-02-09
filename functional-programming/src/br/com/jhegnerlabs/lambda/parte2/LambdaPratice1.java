package br.com.jhegnerlabs.lambda.parte2;

public class LambdaPratice1 {

    public static void main(String[] args) {

        Name name = () -> System.out.println("Meu nome eh Jidlafe");
        name.myName();

    }
}
