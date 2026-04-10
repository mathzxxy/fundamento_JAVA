package if_exemplo;

import java.util.Scanner;

public class ex08IF {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a nota do 1* bimestre");
        float n1 = sc.nextFloat();

        System.out.println("digite a nota do 2* bimestre");
        float n2 = sc.nextFloat();

        float media = (n1 + n2) / 2;

        if (media >= 7){
            System.out.println("aluno Aprovado");

        } else if (media >= 5){

            System.out.println("Aluno em recuperçao");

        }else
        {
            System.out.println("Aluno reprovado");
        }
        sc.close();
    }
}
