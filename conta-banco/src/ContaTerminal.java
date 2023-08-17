import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("""
                Olá, Bem Vindo(a) ao banco da DIO.
                Siga as instruções abaixo para criar a sua conta no nosso banco.
                """);

        System.out.print("Insira o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Insira o número da sua conta: (4 digitos) ");
        int numeroConta = sc.nextInt();

        System.out.print("Insira o valor de depósito inicial: R$ ");
        double saldo = sc.nextDouble();

        System.out.print("Insira o número de sua agência: ");
        sc.nextLine();
        String agencia = sc.nextLine();


        System.out.println("Suporte: 'Olá "+ nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo R$ " + saldo + " já está disponível para saque\'");

        sc.close();

    }
}