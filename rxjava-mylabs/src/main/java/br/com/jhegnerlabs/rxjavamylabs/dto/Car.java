package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.ArrayList;
import java.util.List;

public class Car {

        List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static final class Data {
        private String marca;
        ArrayList< String > pros_cons = new ArrayList<>();
        private String resumo;


        // Getter Methods

        public String getMarca() {
            return marca;
        }

        public String getResumo() {
            return resumo;
        }

        // Setter Methods

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public void setResumo(String resumo) {
            this.resumo = resumo;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "marca='" + marca + '\'' +
                    ", pros_cons=" + pros_cons +
                    ", resumo='" + resumo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "data=" + data +
                '}';
    }
}
