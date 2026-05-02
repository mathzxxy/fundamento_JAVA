package matrizes;

import java.util.Scanner;

public class matrizEx02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[2][2];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Digite numeros : ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(" | " + valor);
            }
            System.out.print("|");
            System.out.println();
        }
        sc.close();
    }
}