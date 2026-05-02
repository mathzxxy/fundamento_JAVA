package revisao01;

import java.util.Scanner;

public class rev_ex05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p;
        System.out.println("digite um numero de 1 a 10:");
        p = sc.nextInt();
       for (int i = 1;i <= 10;i++){
           if (i == p){
               continue;
           }
            System.out.println(i);
        }
        sc.close();
    }
}
