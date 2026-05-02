package DO_whilee;

import java.util.Scanner;

public class ex04DO_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int num;
        do {
            System.out.println("digite alguns numeros :");
            num = sc.nextInt();
        }while (num >= 0);
        System.out.println("numero negativo digitado. Programa encerado");
        sc.close();
    }
}
