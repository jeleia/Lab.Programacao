import java.text.DecimalFormat;
import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dezena;

        System.out.println("Escreva um número inteiro de 3 dígitos:");
        num = sc.nextInt();

        dezena = num/10;
        System.out.println("A dezena do número informado é:" +dezena%10);
    }
}
