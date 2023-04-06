import java.util.Scanner;

public class Ex4_ImparPar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeNumero;
        int numero;
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumero = scanner.nextInt();
        
        int contadoor = 0;

        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();

            if(numero % 2 == 0) quantidadePar++;
            else quantidadeImpar++;

            contadoor++;

        }while(contadoor < quantidadeNumero);

        System.out.println("Quantidade de par: " + quantidadePar);
        System.out.println("Quantidade de Impar: " + quantidadeImpar);

        scanner.close();
    }
}
