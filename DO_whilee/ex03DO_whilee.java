package DO_whilee;

import java.util.Scanner;

public class ex03DO_whilee {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = 1;
        do {
            System.out.println("digite numeros inteiro :");
            num = sc.nextInt();

        }while (num > 0);
        sc.close();
    }
}
