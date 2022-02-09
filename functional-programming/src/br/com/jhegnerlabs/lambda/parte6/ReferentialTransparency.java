package br.com.jhegnerlabs.lambda.parte6;

public class ReferentialTransparency {

    public static void main(String[] args) {

        var result = add(2, 8);
        System.out.println(result);
    }

    static int add (int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        System.out.println("Multiplicando a eh b : " + a + ", " + b);
        return a * b;
    }

}
