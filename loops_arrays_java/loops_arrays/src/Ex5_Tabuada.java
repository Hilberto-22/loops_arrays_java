import java.util.Scanner;

/**
 * Gerador de tabuada
 * 
 */



public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero: ");
        int tabuada = scanner.nextInt();

        System.out.println("TABUADA DE: " + tabuada);

        scanner.close();

        for(int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + "x" + i + "=" + (tabuada*i));
        }

    }
} 
