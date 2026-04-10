package whileeExemplo;

import java.util.Scanner;

public class whileEx08 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int j = 1;
        System.out.println("digite um numero inteiro:");
        i = sc.nextInt();
        while (j <= 10){
            int mult = i * j;
            System.out.println(i + " X "+ j +" = " + mult);
            j++;
        }
        sc.close();
    }
}
