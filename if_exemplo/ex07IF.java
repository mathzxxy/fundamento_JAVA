package if_exemplo;

import java.util.Scanner;

/*
verficar se um ano é bissexto

um ano bissexto
regra : é dibisivel por 4. ex : 2020 -> 2020 % 4 == 0 -> possivel bissexto.
regra : mas se for tambem divisivel por 100, ele nao é bissexto.
ex: 1900 -> 1900 % 4 == 0 e 1900 % 100 == 0 -> nao é bissesto
regra 3 : a exceçao da regra 2 é quando o ano é divisivel por 400,
nesse caso, ele é bissexto
ex : 2000 -> 2000 % 100 == 0 e 2000 % 400 == 0 -> bissexto.
 */
public class ex07IF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um ano ");
        int ano = sc.nextInt();

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {

            System.out.println(ano + " é ano Bissexto");

        } else {
            System.out.println(ano + " nao é Bissexto");

        }

        sc.close();
    }
}
