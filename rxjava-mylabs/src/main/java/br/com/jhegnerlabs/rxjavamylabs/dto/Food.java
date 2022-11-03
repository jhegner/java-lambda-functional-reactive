package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.Arrays;

public class Food {

    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Food{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
