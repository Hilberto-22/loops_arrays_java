import java.util.Scanner;

/**
 * Faça um programa que peça uma nota entre 0 e 10
 * Mostre uma mensagem caso o valor seja invalido e continue pedindo até que o
 * usuario informe um valor valido
 * 
 */

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        
        while(nota < 0 || nota > 10){
            System.out.println("Informe uma nota valida");
            nota = scan.nextInt();
        }
        
        System.out.println("Sucesso");
        scan.close();


    }
}
