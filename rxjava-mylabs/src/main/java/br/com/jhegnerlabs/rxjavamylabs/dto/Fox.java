package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.List;

public class Fox {

    List<Data> data;


    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {
        private String raca;
        private String conservation_status;
        private String average_weight;
        private String average_length;
        private String resumo;


        // Getter Methods

        public String getRaca() {
            return raca;
        }

        public String getConservation_status() {
            return conservation_status;
        }

        public String getAverage_weight() {
            return average_weight;
        }

        public String getAverage_length() {
            return average_length;
        }

        public String getResumo() {
            return resumo;
        }

        // Setter Methods

        public void setRaca(String raca) {
            this.raca = raca;
        }

        public void setConservation_status(String conservation_status) {
            this.conservation_status = conservation_status;
        }

        public void setAverage_weight(String average_weight) {
            this.average_weight = average_weight;
        }

        public void setAverage_length(String average_length) {
            this.average_length = average_length;
        }

        public void setResumo(String resumo) {
            this.resumo = resumo;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "raca='" + raca + '\'' +
                    ", conservation_status='" + conservation_status + '\'' +
                    ", average_weight='" + average_weight + '\'' +
                    ", average_length='" + average_length + '\'' +
                    ", resumo='" + resumo + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Fox{" +
                "data=" + data +
                '}';
    }
}
