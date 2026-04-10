package if_exemplo;

import java.util.Scanner;

/*
classificar um numero como positivo , negativo ou zero.

solicitar que o usuario digite um numero interiro
verificar se o numero  é :
- > positivo (maior que zero)
- > negativo ( menor que zero)
- > igual a zero
exbir mensagem apropiada de acordo com a classificaçao.

 */
public class ex06IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inteiro :");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("NUMERO POSITIVO");
        } else if (num < 0) {
            System.out.println("NUMERO NEGATIVO");
        } else {
            System.out.println("NUMERO IGUAL A ZERO");
        }

        sc.close();
    }
}
