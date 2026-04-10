package whileeExemplo;

import java.util.Scanner;

public class whileEx07 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 1234;
        int senha = 0;
        while (i != senha){
            System.out.println("DIGITE A SENHA :");
            senha = sc.nextInt();
            if (senha != i){
                System.out.println("senha errada");
            }
        }
        System.out.println("senha correta");
        sc.close();
    }
}
