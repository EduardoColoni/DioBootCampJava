package com.contabanco.model;

public class Usuario {
    private int numero;
    private String nomeAgencia;
    private String nomeCliente;
    private double saldo;

    public Usuario(String nomeCliente, String nomeAgencia, int numero, double saldo) {
        this.nomeCliente = nomeCliente;
        this.nomeAgencia = nomeAgencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    // Métodos getters
    public int getNumero() {
        return numero;
    }

    public String getNomeAgencia() {
        return nomeAgencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }
}
