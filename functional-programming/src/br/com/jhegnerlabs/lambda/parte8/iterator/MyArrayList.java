package br.com.jhegnerlabs.lambda.parte8.iterator;

import java.util.function.Consumer;

public class MyArrayList {

    Object[] elemenst;

    public MyArrayList(Object[] elemenst) {
        this.elemenst = elemenst;
    }

    public void forEach(Consumer<Object> action) {
        for (Object o : this.elemenst) {
            action.accept(o);
        }
    }
}
