//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        //Criando um projeto scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        //Solicitando ao usuário os dados e captuando-os

        System.out.println("Por favor, digite o número da conta:");
        int num = scanner.nextInt();
        scanner.nextLine(); //quebra de texto -> consumir

        System.out.println("Por favor, digite uma agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, informe o nome do cliente");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, informe o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        //Fechando o scanner
        scanner.close();

        //Exibindo os dados
        System.out.println("Olá " + nomeCliente + " a sua agência é " + agencia + " o seu saldo inicial na conta " + num + " é " + saldoInicial);

    }
}