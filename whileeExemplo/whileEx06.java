package whileeExemplo;

import java.util.Scanner;

public class whileEx06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int contador = 0;
        while (i != 0){
            System.out.println("digite qualquer numero(0 - sai do loop):");
            i = sc.nextInt();
            if (i > 0){
                contador++;
            }
        }
        System.out.println("quantidade de positivos : "+ contador);
        sc.close();
    }
}
