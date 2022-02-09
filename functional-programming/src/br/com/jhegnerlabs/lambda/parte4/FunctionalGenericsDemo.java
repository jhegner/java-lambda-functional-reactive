package br.com.jhegnerlabs.lambda.parte4;

public class FunctionalGenericsDemo {

    public static void main(String[] args) {

        FunctionalGenerics<String, String> fun = s -> s.substring(1, 5);
        System.out.println(fun.execute("BasicString"));

        FunctionalGenerics<String, Integer> fun1 = s -> s.length();
        System.out.println(fun1.execute("BasicString"));
    }

}
