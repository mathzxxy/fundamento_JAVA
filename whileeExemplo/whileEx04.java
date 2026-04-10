package whileeExemplo;

import java.util.Scanner;

public class whileEx04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i >= 0){
            System.out.println("digite outro numero (para sair DIGITE NUMERO NEGATIVO)");
            i = sc.nextInt();
        }
        System.out.println("NUMERO NEGATIVO");
    }
}
