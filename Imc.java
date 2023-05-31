import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner texto = new Scanner(System.in); // Entrada pelo teclado

        double peso;
        double altura;

        System.out.println("Entre com o seu peso: ");
        peso = texto.nextDouble();

        System.out.println("Entre com a sua altura: ");
        altura = texto.nextDouble();
 
        double calculo;
        calculo = peso / Math.pow(altura, 2);
       	
        System.out.println("Seu IMC e " + calculo);

        if (calculo < 18.5) {
            System.out.println("Classificacao: Magreza");
        } else if (calculo >= 18.6 && calculo <= 24.9) {
            System.out.println("Classificacao: Normal");
        } else if (calculo >= 25 && calculo <= 29.9) {
            System.out.println("Classificacao: Sobrepeso");
        } else if (calculo >= 30 && calculo <= 39.9) {
            System.out.println("Classificacao: Obesidade");
        } else {
            System.out.println("Classificacao: Obesidade grave");
        }
    }
}
