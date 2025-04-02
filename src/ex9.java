import java.text.DecimalFormat;
import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, cent, deze, uni, inverso;

        System.out.println("Escreva um número inteiro de 3 dígitos:");
        num = sc.nextInt();

        cent = num / 100;
        deze = num % 100 / 10;
        uni = num % 10;

        inverso = uni*100 + deze * 10 + cent;
        System.out.println("O número todo invertido é:" +inverso);
    }
}