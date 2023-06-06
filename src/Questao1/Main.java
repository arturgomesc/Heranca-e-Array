package Questao1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("""
                A seguir, número correspondente à gravidade relativa dos seguintes planetas:
                
                | 1 - 0,37 - MERCÚRIO |
                | 2 - 0,88 - VÊNUS |
                | 3 - 0,38 - MARTE |
                | 4 - 2,64 - JÚPITER |
                | 5 - 1,15 - SATURNO |
                | 6 - 1,17 - URANO |
                
                Digite o número correspondente ao planeta que deseja saber seu peso nele:
                
                """);

        int num = input.nextInt();

        System.out.println("\nAgora, digite o seu peso na Terra: \n");
        double peso = input.nextDouble();

        switch (num) {
            case 1:
             double pesoMercurio = peso * 0.37;
                System.out.println("Seu peso em Mercúrio é: " + pesoMercurio);
                break;

            case 2:
                double pesoVenus = peso * 0.88;
                System.out.println("Seu peso em Vênus é: " + pesoVenus);
                break;

            case 3:
                double pesoMarte = peso * 0.38;
                System.out.println("Seu peso em Marte: " + pesoMarte);
                break;

            case 4:
                double pesoJupiter = peso * 2.64;
                System.out.println("Seu peso em Júpiter: " + pesoJupiter);
                break;

            case 5:
                double pesoSaturno = peso * 1.15;
                System.out.println("Seu peso em Saturno: " + pesoSaturno);
                break;

            case 6:
                double pesoUrano = peso * 1.17;
                System.out.println("Seu peso em Urano: " + pesoUrano);
                break;

            default:
                System.out.println("Valor incorreto. Tente novamente");
                break;
        }
    }
}
