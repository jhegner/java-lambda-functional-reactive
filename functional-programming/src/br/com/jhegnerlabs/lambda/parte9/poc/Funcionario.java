package br.com.jhegnerlabs.lambda.parte9.poc;

import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

}
