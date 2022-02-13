package br.com.jhegnerlabs.reactive.parte5.poc;

import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;
    private final String departamento;

    public Funcionario(String nome, BigDecimal salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }
}
