package revisao01;

import java.util.Scanner;

public class rev_ex04 {
    public static void main(String[] args){
        int soma = 0;
        int i;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("digite algum numero (digitar numero negativo - sair)");
            i = sc.nextInt();
            if (i >= 0) {
                soma += i;
            }else {
                break;
            }
        }
        System.out.println("A soma = " + soma);
        sc.close();
    }
}
