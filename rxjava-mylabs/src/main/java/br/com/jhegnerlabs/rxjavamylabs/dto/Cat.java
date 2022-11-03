package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.List;

public class Cat {


    List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {
        private String raca;
        private String resumo;


        // Getter Methods

        public String getRaca() {
            return raca;
        }

        public String getResumo() {
            return resumo;
        }

        // Setter Methods

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public void setResumo(String resumo) {
            this.resumo = resumo;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "raca='" + raca + '\'' +
                    ", resumo='" + resumo + '\'' +
                    '}';
        }
    }

    @Override
    public String  toString() {
        return "Cat{" +
                "data=" + data +
                '}';
    }
}
