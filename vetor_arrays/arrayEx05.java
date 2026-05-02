package vetor_arrays;

import java.util.Scanner;

public class arrayEx05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int []vetor = { 1,5,3,2,6};
        int num;
        int []mult = new int[5];
        System.out.println("Digite um numero para multiplicar :");
        num = sc.nextInt();
        for (int i = 0; i < vetor.length;i++){
            mult[i] = num * vetor[i];
        }
        for (int valor : mult){
            System.out.println(valor);
        }
        sc.close();
    }
}
