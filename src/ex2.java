import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        /*declaração de variaveis*/
        double cel, fa;

        /*entrada de dados*/
        System.out.print("Digite a temperatura em Celsius: ");
        cel = temp.nextDouble();

        /*Processamento de dados*/
        fa = cel * 9 / 5 + 32;
        System.out.print("A temperatura equivalente em Fahrenheit é: " + fa);
    }
}
