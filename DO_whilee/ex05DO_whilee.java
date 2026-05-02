package DO_whilee;

import java.util.Scanner;

public class ex05DO_whilee{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int con = 0;
        int soma = 0;
        do {
            System.out.println("digite numeros positivos(numero 0 e negativos termina o programa) :");
            num = sc.nextInt();
            if (num != -1){
                soma+=num;
                con++;
            }
        }while (num != 0);

        if (con > 0) {
            double media =(double) soma / con;
            System.out.println(" a media de todos os numeros " + media);
        }else {
            System.out.println("nenhum numero digitado");
        }
        sc.close();
    }
}
