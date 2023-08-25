
package desafio.fibonacci;

import java.util.Scanner;

public class DesafioFibonacci {

    public static void main(String[] args) {
        /*Calcular a sequência de Fibonacci até N termos.*/
        int fibonacci = 1, num_anterior = 0, quant_termos = 0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Quantos termos da sequencia fibonacci deseja? ");
        quant_termos = cin.nextInt();
        System.out.print("Essa eh os termos da sequencia fibonacci que pediu: ");
        System.out.print(fibonacci);
        for (int i = 0; i < quant_termos; i++){
            num_anterior = fibonacci - num_anterior;
            fibonacci = fibonacci + num_anterior;
            System.out.print(", " + fibonacci);
        }
    }
    
}
