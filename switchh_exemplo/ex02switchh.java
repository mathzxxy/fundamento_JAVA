package switchh_exemplo;

import java.util.Scanner;

public class ex02switchh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    System.out.println("Digite o primeiro numero :");
    int n1 = sc.nextInt();

    System.out.println("Digite o segundo numero :");
    int n2 = sc.nextInt();

    System.out.println("digite qual conta vc quer q faça\n" +
            "1 - soma\n" +
            "2 - sub\n" +
            "3 - mult\n" +
            "4 - div\n");
    int op = sc.nextInt();
    switch (op){
        case 1:
            int soma = n1 + n2;
            System.out.println("a soma = " + soma);
            break;
        case 2:
            int sub = n1 - n2;
            System.out.println("a sub = " + sub);
            break;
        case 3:
            int mult = n1 * n2;
            System.out.println("A mult = " + mult);
            break;
        case 4:
            if (n2 != 0) {

                int div = n1 / n2;

                System.out.println("a div = " + div);

            }else {
                System.out.println("erro : divisao por zero");
            }
            break;
        default:
            System.out.println("invalidos");
            break;
    }
    }
}
