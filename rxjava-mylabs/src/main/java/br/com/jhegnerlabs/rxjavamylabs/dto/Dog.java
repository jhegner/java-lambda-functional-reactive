package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.ArrayList;
import java.util.List;

public class Dog {

    List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {

        private String nome;
        private ArrayList<String> qualidades = new ArrayList<>();
        private String resumo;


        // Getter Methods

        public String getNome() {
            return nome;
        }

        public String getResumo() {
            return resumo;
        }

        // Setter Methods

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setResumo(String resumo) {
            this.resumo = resumo;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "nome='" + nome + '\'' +
                    ", qualidades=" + qualidades +
                    ", resumo='" + resumo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "data=" + data +
                '}';
    }
}