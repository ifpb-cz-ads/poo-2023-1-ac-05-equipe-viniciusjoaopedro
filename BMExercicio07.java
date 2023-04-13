/* Escreva um programa que, dada uma variável x (com valor 180, por
exemplo), temos y de acordo com a seguinte regra:
se x é par, y = x / 2
se x é impar, y = 3 * x + 1
imprime y
O programa deve então jogar o valor de y em x e continuar até que y
tenha o valor final de 1. */

import java.util.Scanner;

public class BMExercicio07 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o valor de X: ");
        int x = scanner.nextInt();
        int y = 0;
        int contador = 0;
        while(y != 1) {
            if(x % 2 == 0) { // Caso X seja par
                y = x / 2;
            } else { // Caso seja impar
                y = 3 * x + 1;
            }
            // Caso nao seja o primeiro valor a ser impresso
            if(contador > 0) {
                System.out.print(" -> ");
            }
            System.out.print(y);
            x = y;
            contador++;
        }
    }
}
