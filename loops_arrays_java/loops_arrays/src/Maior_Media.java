import java.util.Scanner;

/*
 * 
 * 
 * 
 */

public class Maior_Media {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int contador = 0;
        int maior = 0;
        int soma = 0;

        do{
            System.out.println("Digite um numero: ");
            numero = scan.nextInt();

            soma = soma + numero;
            
            if(numero > maior) maior = numero;
            contador++;
            
        } while(contador < 5);
        
        System.out.println("Acabou a contagem!!!");
        System.out.println("Media: " + soma/5);
        System.out.println("Maior: " + maior);

        scan.close();
    }
}
