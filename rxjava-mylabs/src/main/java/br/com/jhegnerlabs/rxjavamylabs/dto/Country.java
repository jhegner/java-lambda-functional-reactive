package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.List;

public class Country {

    List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {

        private String nome;
        private String idioma;


        // Getter Methods


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getIdioma() {
            return idioma;
        }

        public void setIdioma(String idioma) {
            this.idioma = idioma;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "nome='" + nome + '\'' +
                    ", idioma=" + idioma +
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