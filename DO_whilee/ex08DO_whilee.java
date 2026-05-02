package DO_whilee;

import java.util.Scanner;

public class ex08DO_whilee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1;
        int num;
        System.out.println("digite um numero da tabuada de 0 a 10 ");
        num = sc.nextInt();
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }while (i <= 10);
    }
}
