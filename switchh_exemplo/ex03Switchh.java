package switchh_exemplo;
/*
classificaçao de letras

criar um programa que solicite ao usuario uma letra do alfabeto.
- o programa deve indentificar se a letra digitada é uma vogal ou uma consoante
a estrutura switch sera usada para fazer essa verificaçao.
 */

import java.util.Scanner;

public class ex03Switchh {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("DIGITE SO UMA LETRA :");
        //chatAT(0): extrai apenas o primeiro caracter da
        char letra = sc.next().toLowerCase().charAt(0);

        switch (letra){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letra + " = É UMA VOGAL");
                break;
            default:
                if (Character.isLetter(letra)) // é usado Character.isLetter(letra) pra saber se é uma letra
                     {
                    System.out.println("É UMA CONSOANTE");
                } else {
                    System.out.println("caracter invalido");
                }
        }
        sc.close();
    }
}
