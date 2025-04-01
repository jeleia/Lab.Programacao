import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner carro = new Scanner(System.in);

        double litros, tempo, vMedia;

        System.out.print("Insira o tempo gasto: ");
        tempo = carro.nextDouble();
        System.out.print("Insira a velocidade média em km/s: ");
        vMedia = carro.nextDouble();

        litros = (vMedia * tempo) / 10.5;
        System.out.print("A quantidade de litros gasta por km foi de: " + litros);
    }
}
