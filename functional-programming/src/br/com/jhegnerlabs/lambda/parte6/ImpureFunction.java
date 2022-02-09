package br.com.jhegnerlabs.lambda.parte6;

public class ImpureFunction {

    private int value = 0;

    public int add(int nexValue) {
        this.value += nexValue;
        return this.value;
    }

}
