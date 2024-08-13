package com.contabanco;

import com.contabanco.model.ImprimirDados;
import com.contabanco.model.Usuario;
import com.contabanco.model.ExceptionLetrasNumeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionLetrasNumeros validador = new ExceptionLetrasNumeros();

        String nomeCliente = "";
        String nomeAgencia = "";
        String cpf= "";
        float saldo = 0;

        try {
            // Captura os dados do usuário
            System.out.println("Bem-vindo ao sistema de contas bancárias!\n");

            System.out.print("Por favor, digite o nome do cliente: ");
            nomeCliente = scanner.nextLine();
            validador.verificarLetras(nomeCliente);

            System.out.print("Por favor, digite o nome da agência: ");
            nomeAgencia = scanner.nextLine();
            validador.verificarLetras(nomeAgencia);


            System.out.print("Por favor, digite o seu CPF: ");
            cpf = scanner.nextLine();
            validador.verificarLetras(cpf);

        } catch (Exception e) {
            System.out.println("Apenas letras são permitidas!!");
            return;
        }

        try {
            System.out.print("Por favor, digite o valor do saldo: ");
            saldo = scanner.nextFloat();
            validador.verificarNumeros(saldo);
        }catch (Exception e) {
            System.out.println("É permitido apenas numeros!!");
            return;
        }
        // Fecha o scanner
        scanner.close();

        // Cria uma instância de Usuario com os dados fornecidos
        Usuario usuario = new Usuario(nomeCliente, nomeAgencia, cpf, saldo);

        // Cria uma instância de ImprimirDados
        ImprimirDados imprimirDados = new ImprimirDados();

        // Chama o método para imprimir os dados do usuário
        imprimirDados.imprimirDadosUsuario(usuario);
    }
}
