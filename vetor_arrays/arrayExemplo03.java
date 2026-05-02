package vetor_arrays;

import java.util.Scanner;

public class arrayExemplo03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []numeros = new int[10];
        int pares = 0;
        for (int i = 0;i < numeros.length;i++){
            System.out.println("digite o numero " + (i+1)+ " : ");
            numeros[i] = sc.nextInt();
            if (numeros[i] % 2 == 0){
                pares++;
            }
        }
        System.out.println("quantidade de numeros pares : " + pares);
        sc.close();
    }
}
