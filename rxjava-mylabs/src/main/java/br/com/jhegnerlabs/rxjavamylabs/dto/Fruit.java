package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.Arrays;

public class Fruit {

    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
