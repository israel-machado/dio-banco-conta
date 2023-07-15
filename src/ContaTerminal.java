import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o número da conta: ");
        int accNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Insira a agência: ");
        String agency = sc.nextLine();

        System.out.print("Nome do cliente: ");
        String clientName = sc.nextLine();

        System.out.print("Saldo: ");
        Double balance = sc.nextDouble();

        System.out.println();

        System.out.println("Olá " +
                        clientName +
                ", obrigado por criar uma conta em nosso banco, sua agência é " +
                agency +
                ", conta " +
                accNumber + " e seu saldo " +
                balance +
                " já está disponível para saque.");
    }
}