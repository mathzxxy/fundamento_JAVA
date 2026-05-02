package matrizes;

import java.util.Scanner;

public class matrizEx07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int[][] matriz = new int[3][3];
        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[i].length;j++){
                System.out.print("digite numero da matriz [" + i +"] ["+ j + "] :");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.print("digite o numero que voçe quer procura :");
        num = sc.nextInt();

        for (int i = 0;i < matriz.length;i++){
            for (int j = 0;j < matriz[i].length;j++){
                if (num == matriz[i][j]){
                    System.out.println("O numero esta na Posiçao ["+ i + "] [" + j +"] = " + matriz[i][j]);
                }
            }
        }
        sc.close();
    }

}
