package br.com.jhegnerlabs.reactive.parte1;

public interface CallBack {

//    void call();

    void pushData(String data);

    void pushComplete();

    void pushError(Exception ex);

}
