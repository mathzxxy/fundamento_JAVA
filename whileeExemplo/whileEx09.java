package whileeExemplo;

import java.util.Scanner;

public class whileEx09 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int fatorial = 1;
        int numeros;
        System.out.println("digite um numero inteiro");
        numeros = sc.nextInt();
        while (i <= numeros){
            fatorial *= i;
            i++;
        }
        System.out.println("fatorial de " + numeros + " é " + fatorial);
        sc.close();

    }
}
