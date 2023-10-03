package contaBancoDesafio;

import java.util.Calendar;
import java.util.Scanner;

public class ContaTerminal {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int numero;
            String agencia;
            String nomeCliente;
            double saldo;

            System.out.println("CONTA BANCÁRIA");
            System.out.println();
            System.out.println("Por favor, digite o número da conta: ");
            numero = sc.nextInt();

            System.out.println("Por favor, digite o número da Agência: ");
            agencia = sc.next();

            System.out.println("Qual o seu nome: ");
            nomeCliente = sc.next();
            sc.nextLine();

            System.out.println("Qual o seu saldo atual: ");
            saldo = sc.nextDouble();

            System.out.println();
            System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, "
                    + "conta %d e seu saldo %.2f já está disponíve para saque.", nomeCliente, agencia, numero, saldo);

            System.out.println();
            Calendar cal = Calendar.getInstance();
            int hora = cal.get(Calendar.HOUR_OF_DAY);
                if(hora < 12 ) {
                    System.out.print("Tenha um ótimo dia!");
                }else if(hora >= 12 && hora < 18) {
                    System.out.print("Tenha um ótima tarde! ");
                }else {
                    System.out.print("Tenha um ótima noite!");
                }
            sc.close();
        }
}