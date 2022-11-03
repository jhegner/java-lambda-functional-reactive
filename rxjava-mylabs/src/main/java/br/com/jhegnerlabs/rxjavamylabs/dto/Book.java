package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.List;

public class Book {

    List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {

        private String titulo;
        private String autor;


        // Getter Methods


        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor() {
            return autor;
        }

        public void setAutor(String autor) {
            this.autor = autor;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "titulo='" + titulo + '\'' +
                    ", autor='" + autor + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Country{" +
                "data=" + data +
                '}';
    }
}