package DO_whilee;

import java.util.Scanner;

public class ex07DO_while {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int senha = 1234;
        int tenta;
        do {
            System.out.println("digite a senha correta");
            tenta = sc.nextInt();
            if (tenta != senha) {
                System.out.println("senha errada, tente novamente");
            }
        }while (tenta != senha);
        System.out.println("senha correta : " + senha);
        sc.close();
    }
}
