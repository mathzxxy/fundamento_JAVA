package vetor_arrays;

import java.util.Scanner;

public class arrayEx04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[]numeros = new double[5];
        double soma = 0;
        double media;
        for (int i = 0;i < numeros.length;i++){
            System.out.println("digite numeros para calcular a media :");
            numeros[i] = sc.nextInt();
            soma+=numeros[i];
        }
        media = (soma / numeros.length);
        System.out.println("a media é : " + media);
        sc.close();
    }
}
