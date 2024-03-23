//Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
//mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
//(Ex: 3 anos, 2 meses e 15 dias = 1170 dias.



import java.util.Scanner;
public class Idadet {
    public static void main(String[] args) {
    int mes,dia,anos,cal,mesf,contaa,contam,somat;
    Scanner ler = new Scanner(System.in);
    cal = 365;
    mesf = 30;
    System.out.println("Digite quantos anos vc tem:");
    anos = ler.nextInt();
    contaa = cal * anos;
    System.out.println("Agora digite em meses: ");
    mes = ler.nextInt();
    contam = mes * mesf;
    System.out.println("Digite em dias agora: ");
    dia = ler.nextInt();
    somat = contam + contaa + dia;
    System.out.printf(anos +" anos "+ mes + " meses e "+ dia + " dias : " + somat + " dias" );
    }

}
