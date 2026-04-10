package switchh_exemplo;

import java.util.Scanner;

public class ex01Switchh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite um numero de 1 a 7");
        int num = sc.nextInt();

        switch (num){
            case 1:
                System.out.println("1 - domingo ");
                break;
            case 2 :
                System.out.println("2 - segunda ");
                break;
            case 3:
                System.out.println("3 - terça ");
                break;
            case 4:
                System.out.println("4 - quarta");
                break;
            case 5:
                System.out.println("5 - quinta ");
                break;
            case 6:
                System.out.println("6 - sexta ");
                break;
            case 7:
                System.out.println("7 - sabado");
                break;
            default:
                System.out.println("invalido");
                break;
        }
sc.close();
    }
}
