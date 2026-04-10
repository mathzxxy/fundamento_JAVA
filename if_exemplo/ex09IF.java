package if_exemplo;

import java.util.Scanner;
/*
verificar se uma letra é vogal ou consoante

- o prpgrama deve solicitar que o usuario digite uma letra.
- apos a entrada , o programa deve indentificar se a letra digitada é :
-> volgal : a, e ,i o, u(considerando letra minusculas)
-> consoantes : qualquer outra letra do alfabeto que nao seja vogal
 */
public class ex09IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite uma letra :");
        String letra = sc.nextLine().toLowerCase();

        if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u")){

            System.out.println("é uma vogal");

        } else {

            System.out.println("é consoante");

        }
        sc.close();
    }
}
