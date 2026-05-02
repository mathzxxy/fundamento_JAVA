package DO_whilee;

import java.util.Scanner;

public class exemplo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("exemplo 01 = vai ser contando de 1 a 5");
        int contador = 1;

        do {
            System.out.println("contador : " + contador);
            contador++;
        }while (contador <= 5);

        int op;
        do {
            System.out.println("menu");
            System.out.println("opçao 1");
            System.out.println("opçao 2");
            System.out.println("opçao 0 sair ");
            op = sc.nextInt();
            if (op == 1) {
                System.out.println("escolheu a 1");
            }
            else if (op == 2) {
                System.out.println("escolheu a 2");
            }else if (op != 0){
                System.out.println("opçao invalida");
            }
        }while(op != 0);
        System.out.println("opçao sainda");

        int num;
        do {
            System.out.println("digite um numero positivo");
            num = sc.nextInt();
            if (num < 0){
                System.out.println("numero invalido, tente novamente");
            }
        }while (num < 0);
        System.out.println("numero aceito " + num);
    }
}
