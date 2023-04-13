// imprima todos os múltiplos de 3, entre 1 e 100.

public class BMExercicio08 {
    public static void main(String args[]) {
        System.out.println("Todos os multiplos de 3, entre 1 e 100: ");
        for (int i = 3; i <= 100; i++) {
            // Caso seja multiplo de 3
            if(i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
