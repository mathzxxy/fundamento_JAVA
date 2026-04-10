package if_exemplo;

import java.util.Scanner;

/*
determinar qual dos dois numeros é maior

solicitar dois numero ao usuario
comparar esse dois numeros utilizando estrutura condicionais(if / else if/ else)
exibir uma mensagem indicando qual numero é o maior, ou ambos sao iguais.
 */
public class ex03IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o primeiro numero :");
        float num1 = sc.nextFloat();


        System.out.println("digite o segundo numero :");
        float num2 = sc.nextFloat();

        if (num1 > num2){
            System.out.println("numero " + num1 + " é o maior");
        } else if (num1 < num2){
            System.out.println("numero " + num2 + " é o maior");
        }else {
            System.out.println("ambos sao iguais");
        }

        sc.close();

    }
}
