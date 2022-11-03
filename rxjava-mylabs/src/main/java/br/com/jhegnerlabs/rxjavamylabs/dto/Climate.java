package br.com.jhegnerlabs.rxjavamylabs.dto;

import java.util.ArrayList;
import java.util.List;

public class Climate {

    List<Data> data;

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    private static class Data {

        private String day;
        private Integer temp;


        // Getter Methods

        public String getDay() {
            return day;
        }

        public void setDay(String day) {
            this.day = day;
        }

        public Integer getTemp() {
            return temp;
        }

        public void setTemp(Integer temp) {
            this.temp = temp;
        }

        @Override
        public String toString() {
            return "Data{" +
                    "day='" + day + '\'' +
                    ", temp=" + temp +
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