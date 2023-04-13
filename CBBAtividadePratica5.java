// Faça um programa que imprima todos os números pares de 0 a 100.

public class CBBAtividadePratica5 {
  public static void main(String[] args) {
  
   int i;
   
    System.out.println("Os números pares de 0 a 100: ");

    for (i=0; i<=100; i++) {
        // Caso seja par
        if (i % 2 == 0){
            System.out.print(i + " ");
        }
    }
  }
}
