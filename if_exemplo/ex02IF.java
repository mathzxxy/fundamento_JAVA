package if_exemplo;
/*
verificar se um numero é impar ou par

solicitar que o usuario digite um numero interiro
detrminar se o numero digitado é numero par ou impar

 */

import java.util.Scanner;

public class ex02IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero inteiro");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero é PAR");
        }else if ( num % 2 == 1){
            System.out.println("O numero é IMPAR");
        }else {
            System.out.println("numero negativo, NAO vai rodar se é par ou impar");
        }
    }
}
