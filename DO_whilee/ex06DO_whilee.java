package DO_whilee;

import java.util.Scanner;

public class ex06DO_whilee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int co = 0;
        do {
            System.out.println("digite numeros");
            num = sc.nextInt();
            co++;
            if (num == 0){
                co--;
            }
        }while (num > 0);
        System.out.println("numeros positivos digitados :"+ co);
        sc.close();
    }
}
