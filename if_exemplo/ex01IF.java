package if_exemplo;
//criar um programa que receba um numero inteiro do usuario
// e verifique que ele é positivo ou nao

import java.util.Scanner;

//regras de verificaçao :
//-- se o numero for maior que zero : "imprimir "o numero é positivo".
// -- caso contrario ( ou seja, se for zero ou negativo) : imprimir " o numero nao é positivo
//...
public class ex01IF {
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numero(negativo ou positivo) :");
        int num = sc.nextInt();

        if (num > 0){
            System.out.println("O numero é positivo");
        }else
        {
            System.out.println("O numero nao é positivo");
        }
        sc.close();
    }
}
