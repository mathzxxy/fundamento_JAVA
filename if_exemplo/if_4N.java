package if_exemplo;

import java.util.Scanner;

public class if_4N {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua idade :");
        int idade = sc.nextInt();

        sc.nextLine();

        System.out.println("voçe é brasileiro ou nacionalizado ?(sim/nao)");
        String nacionalidade = sc.nextLine().toLowerCase();

        if (idade >= 16 && nacionalidade.equals("sim")){
            System.out.println("voce pode votar");
        }else{
            System.out.println("voce NAO pode votar");
        }
        sc.close();
    }
}
