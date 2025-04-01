import java.text.DecimalFormat;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0,000.00");
        Scanner sc = new Scanner(System.in);
        double hTrab, hAula, descInss, sBruto, sLiquido,vInss;

        System.out.println("Insira o valor da hora-aula:");
        hAula = sc.nextDouble();

        System.out.println("Insira o número de horas trabalhadas:");
        hTrab = sc.nextDouble();

        System.out.println("Insira a porcentagem de desconto do INSS:");
        descInss = sc.nextDouble();

        sBruto = hAula * hTrab;
        System.out.println("O valor do salário bruto é:" +df.format(sBruto));

        vInss = sBruto * (descInss / 100);
        System.out.println("O valor do desconto do INSS é:" +df.format(vInss));

        sLiquido = sBruto - vInss;
        System.out.println("O valor do salário liquido é:" +df.format(sLiquido));

        System.out.println("O valor do salario líquido com 2 casas decimais é:" +df.format(sLiquido));
    }
}
