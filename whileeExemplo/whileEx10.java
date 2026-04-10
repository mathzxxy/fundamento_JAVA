package whileeExemplo;

import java.util.Scanner;

public class whileEx10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro :");
        int n1 = sc.nextInt();
        System.out.println("digite um numero inteiro :");
        int n2 = sc.nextInt();
        if (n1 == n2){
            System.out.println("numeros iguais");
        }else {
            int menor = Math.min(n1,n2);
            int maior = Math.max(n1,n2);
            int atual = menor + 1;
            while (atual < maior){
                System.out.println(atual);
                atual++;
            }
            sc.close();
        }
    }
        }


