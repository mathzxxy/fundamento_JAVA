package whileeExemplo;

import java.util.Scanner;

public class whileEx03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = -1;
        while (i != 0){
            System.out.println("digite numero :");
             i = sc.nextInt();
        }
        System.out.println(" 0 ");
    }
}
