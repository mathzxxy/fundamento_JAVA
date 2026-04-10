package switchh_exemplo;

import java.util.Scanner;

public class switcl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("1 - vermelho");
        System.out.println("2 - azul");
        System.out.println("3 - amarelho");
        System.out.println("4 - roxo ");
        System.out.println("escolha :");
        int n = sc.nextInt();

        switch (n){
            case 1:
                System.out.println("voce escolheu a cor vermelha");
                break;
            case 2:
                System.out.println("voce escolheu a cor azul");
                break;

            case 3:
                System.out.println("voce escolheu a cor amarelho");
                break;
            case 4:
                System.out.println("voce escolheu a cor roxo");
                break;
            default:
                break;
        }
        sc.close();
    }
}
