// Arquivo: Contador.java
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        int parametroUm = terminal.nextInt(); // Leitura do primeiro parâmetro
        System.out.println("Digite o segundo parâmetro:");
        int parametroDois = terminal.nextInt(); // Leitura do segundo parâmetro

        try {
            contar(parametroUm, parametroDois); // Chamada ao método contar
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage()); // Impressão da mensagem da exceção
        } finally {
            terminal.close(); // Fechamento do Scanner
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
