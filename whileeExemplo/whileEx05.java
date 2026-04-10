package whileeExemplo;

import java.util.Scanner;

public class whileEx05 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        float i = 0;
        float contador = 0;
        float media = 0;
        float soma = 0;
        while (i != -1){
            System.out.println("digite a nota para fazer a media, digite - 1 para poder sair");
            i = sc.nextInt();
            if (i != -1){
                soma += i;
                contador++;
            }


        }
        media = soma / contador;
        System.out.println(" a soma é " + soma);
        System.out.println(" a media é " + media);
        System.out.println(" a quantidade de numero digitados " + contador);
    }
}
