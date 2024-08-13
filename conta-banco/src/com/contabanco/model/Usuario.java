package com.contabanco.model;

public class Usuario {
    private String cpf;
    private String nomeAgencia;
    private String nomeCliente;
    private float saldo;

    public Usuario(String nomeCliente, String nomeAgencia, String cpf, float saldo) {
        this.nomeCliente = nomeCliente;
        this.nomeAgencia = nomeAgencia;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    // Métodos getters
    public String getCpf() {
        return cpf;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }
}
