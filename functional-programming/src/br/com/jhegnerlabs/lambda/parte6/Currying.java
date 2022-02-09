package br.com.jhegnerlabs.lambda.parte6;

public class Currying {

    public static void main(String[] args) {

        Function<Integer, Function<Integer, Integer>> fun1 = u -> v -> u + v;

        Function<Integer, Integer> fun2 = fun1.apply(1);

        Integer sum1 = fun2.apply(2);

        System.out.println(sum1);

    }

}
