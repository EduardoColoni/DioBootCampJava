package com.contabanco;

import com.contabanco.model.ImprimirDados;
import com.contabanco.model.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Captura os dados do usuário
        System.out.println("Bem-vindo ao sistema de contas bancárias!\n");

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o nome da agência: ");
        String nomeAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o número do cliente: ");
        int numero = scanner.nextInt();

        System.out.print("Por favor, digite o valor do saldo: ");
        double saldo = scanner.nextDouble();

        // Fecha o scanner
        scanner.close();

        // Cria uma instância de Usuario com os dados fornecidos
        Usuario usuario = new Usuario(nomeCliente, nomeAgencia, numero, saldo);

        // Cria uma instância de ImprimirDados
        ImprimirDados imprimirDados = new ImprimirDados();

        // Chama o método para imprimir os dados do usuário
        imprimirDados.imprimirDadosUsuario(usuario);
    }
}
