
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numero;
        String agencia;
        double saldo;
        String nome;

        System.out.println("Bem-vindo! Por favor, informe o número da agência:");
        agencia = scan.nextLine();

        System.out.println("Insira o número da conta: ");
        numero = Integer.parseInt(scan.nextLine());

        System.out.println("Insira seu nome: ");
        nome = scan.nextLine();

        System.out.println("Insira o saldo: ");
        saldo = Double.parseDouble(scan.nextLine());

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s, e seu saldo de R$ %s já está disponível para saque",
                nome, agencia, numero, saldo);
    }
}
