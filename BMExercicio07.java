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
