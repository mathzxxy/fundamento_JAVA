package vetor_arrays;

import java.util.Scanner;

public class arrayEx02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []numero = new int[5];
        for (int i = 0;i < numero.length;i++){
            System.out.println("digite numeros , Posiçao " + (i + 1) + " : ");
            numero[i] = sc.nextInt();
        }
        System.out.println("Numeros digitados :");
        for (int v : numero){
            System.out.println(v);
        }
        sc.close();
    }
}
