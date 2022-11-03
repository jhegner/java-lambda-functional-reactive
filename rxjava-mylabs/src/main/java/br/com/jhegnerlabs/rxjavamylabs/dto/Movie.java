package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.Arrays;

public class Movie {

    private String[] data;

    public String[] getData() {
        return data;
    }

    public void setData(String[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
