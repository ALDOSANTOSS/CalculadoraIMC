import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu peso!");
        double peso = sc.nextDouble();
        System.out.println("Informe sua altura!");
        double altura = sc.nextDouble();


        double imc;
        imc = peso / (altura * altura);
        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc >= 18.6 && imc <= 24.9) {
            System.out.println("Saudavel");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Obesidade Grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau 2");
        } else {
            System.out.println("Obesidade Grau 3");
        }


    }
}
