package br.com.jhegnerlabs.lambda.parte8;

import java.util.function.Consumer;

public class MyArrayList {

    Object[] elemenst = new Object[5];

    public MyArrayList(Object[] elemenst) {
        this.elemenst = elemenst;
    }

    public void forEach(Consumer action) {
        for (int i = 0; i < this.elemenst.length; i++) {
            action.accept(elemenst[i]);
        }
    }
}
