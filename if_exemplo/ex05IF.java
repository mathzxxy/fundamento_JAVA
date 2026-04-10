package if_exemplo;

import java.util.Scanner;

/*
verificar se um numero é multiplo a 3 e 5 ao mesmo tempo

solicitar que o usuario digite numero interiro.
verificar se o numero digitado e multiplo a e e tambem mutiplo a 5.

 */
public class ex05IF {
    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);

        System.out.println("digite um numero interiro :");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("ambos sao mutiplos a 3 e 5");
        } else {
            System.out.println("nao sao multiplo a 3 e 5");
        }
        sc.close();
    }
}
