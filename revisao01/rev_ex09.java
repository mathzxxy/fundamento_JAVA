package revisao01;

import java.util.Scanner;

public class rev_ex09 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua palavra :");
        String palavra = sc.nextLine().toLowerCase();

        for (int i = 0;i < palavra.length();i++){

            char letra = palavra.charAt(i);

        if (!(letra == 'a'|| letra == 'e'|| letra == 'i' || letra == 'o'|| letra == 'u')){

            System.out.println("cosoante : "+ letra);

        } else {

            System.out.println("vogal : "+ letra);

        }
        }
    }
}
