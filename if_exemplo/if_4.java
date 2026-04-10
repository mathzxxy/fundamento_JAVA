package if_exemplo;

import java.util.Scanner;

public class if_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a nota do aluno");
        double nota = sc.nextDouble();
        if (nota >= 7){
            System.out.println("Aluno aprovado");
        }else if(nota >= 5){
            System.out.println("Aluno recuperaçao");
        }else {
            System.out.println("aluno reprovado");
        }
        sc.close(); //fechar o obejto scanner
        //é uma boa pratica fechar recursos de Sistema apos o uso
        //aqui estamos liberando a memoria associada ao scanner
    }
}
