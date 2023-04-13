/* Altere o programa do exercício anterior para ficar recebendo o número
dentro de um laço enquanto for diferente de 0 (zero). */

import java.util.Scanner;

public class BMExercicio06 {
    public static void main(String[] args) {

        int dia;

        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Informe um número de 1 a 7: ");
            dia = scan.nextInt();

            switch (dia) {
                case 1: System.out.println("Domingo.");
                break;
                case 2: System.out.println("Segunda-feira.");
                break;
                case 3: System.out.println("Terça-feira.");
                break;
                case 4: System.out.println("Quarta-feira.");
                break;
                case 5: System.out.println("Quinta-feira.");
                break;
                case 6: System.out.println("Sexta-feira.");
                break;
                case 7: System.out.println("Sábado.");
                break;
                default: System.out.println("Dia inválido!");
            }
        } while (dia != 0);
    }
}