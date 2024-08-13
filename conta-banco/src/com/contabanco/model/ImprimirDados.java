package com.contabanco.model;

public class ImprimirDados {
    public void imprimirDadosUsuario(Usuario usuario) {
        System.out.println("Nome do cliente: " + usuario.getNomeCliente());
        System.out.println("Nome da agência: " + usuario.getNomeAgencia());
        System.out.println("CPF do cliente: " + usuario.getCpf());
        System.out.println("Saldo do cliente: " + usuario.getSaldo());
    }
}
