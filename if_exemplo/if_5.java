package if_exemplo;

import java.util.Scanner;

public class if_5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a sua idade :");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.println("voçe é estudante ? (sim/nao)");
        String estudante = sc.nextLine().toLowerCase();

        if (idade < 18 || estudante.equals("sim")){

            System.out.println("voçe tem meia entrada no cinema");

        }else {

            System.out.println("voçe nao tem direito a meia entrada")
            ;
        }
    }
}
