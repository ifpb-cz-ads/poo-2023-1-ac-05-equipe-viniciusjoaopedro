/* Altere o programa do exercício anterior para ficar recebendo o número
dentro de um laço enquanto for diferente de 0 (zero). */

import java.util.Scanner;

public class BMExercicio06 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = -1;
        do {
            System.out.print("Informe um número entre 1 e 7: ");
            numero = scanner.nextInt();
            
            if(numero != 0) {
                String dia_da_semana;
                
                // Exibirá o dia da semana correspondente ao número
                switch(numero) {
                    case 1:
                        dia_da_semana = "domingo";
                        break;
                    case 2:
                        dia_da_semana = "segunda";
                        break;
                    case 3:
                        dia_da_semana = "terça";
                        break;
                    case 4:
                        dia_da_semana = "quarta";
                        break;
                    case 5:
                        dia_da_semana = "quinta";
                        break;
                    case 6:
                        dia_da_semana = "sexta";
                        break;
                    default:
                        dia_da_semana = "sabado";
                        break;
                }
                System.out.println("O " + numero + "º dia da semana eh " + dia_da_semana);
            }
            
        } while(numero != 0);
    }
}
