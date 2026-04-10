package if_exemplo;
/*
verificar se um numero esta dentro do intervalo[10,100]

ler numero interiro informando pelo usuario.
verificar se esse numero esta dentro do intervalo fechado que vai de 10 ate 100
exibir uma mensagem no console informando se o numero esta ou nao dentro desse intervalo.

 */

import java.util.Scanner;

public class ex04IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero de 10 a 100 :");
        int numero = sc.nextInt();

        if (numero >= 10 && 100 >= numero) {
            System.out.println("numero esta no intervalo de [10,100]");
        } else {
            System.out.println("numero nao se encontra entre o intervalo de [10,100]");
        }
        sc.close();
    }
}
