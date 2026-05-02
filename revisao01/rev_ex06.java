package revisao01;

import java.util.Scanner;

public class rev_ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = "1234";
        for (int i = 1; i <= 3; i++) {
            System.out.println("digite a senha :");
            String letra = sc.nextLine().toLowerCase();
            if (letra.equals(senha)) {
                System.out.println("senha correta...Acesso permitido");
                break;
            } else {
                System.out.println("senha incorreta..., voce tem " + i + "/3 tentativas");
            }
        }
    }
}
