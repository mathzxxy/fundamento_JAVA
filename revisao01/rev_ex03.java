package revisao01;

import java.util.Scanner;

public class rev_ex03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (true){
            System.out.println("digite um numero(digito -1 acaba o lop)");
            num = sc.nextInt();
            if (num == -1){
                System.out.println("encerrado...");
                break;
            }
        }
        System.out.println("voce digitou -1");
        sc.close();
    }
}
