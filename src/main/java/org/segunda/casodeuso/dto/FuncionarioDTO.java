package org.segunda.casodeuso.dto;

public class FuncionarioDTO {

    private String nome;
    private String cargo;
    private double salario;

    public FuncionarioDTO(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
