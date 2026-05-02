package ListaExemplo;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaExemplo03 {
    public static void main(String[] args){
        System.out.println("criando e acessando Lista em Java");

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        System.out.println("Lista de numeros : " + numeros);
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("maça" , "banana","cereja"));
        System.out.println("Lista de frutas : " + frutas);
        /*
        ArrayList<Object> mista : uma lista que aceita qualquer tipo de dado (mistura números, textos, booleanos, etc).
            mista.add(10): Adiciona um número inteiro (Integer).

            mista.add("ola"): Adiciona uma frase ou palavra (String).

            mista.add(2.5): Adiciona um número decimal (Double).

            mista.add(new ArrayList<>(...)): Adiciona uma outra lista dentro da lista principal (isso é uma lista aninhada).

            mista.add(true): Adiciona um valor lógico (Boolean).
         */
        ArrayList<Object> mista = new ArrayList<>();
        mista.add(10);
        mista.add("ola");
        mista.add(2.5);
        mista.add(new ArrayList<>(Arrays.asList("a","b")));
        mista.add(true);

        System.out.println("lista mista : " + mista);

        ArrayList<String> frutas2 = new ArrayList<>(Arrays.asList("maça","banana","cereja","damasco"));

        System.out.println("\n Primeira fruta : " + frutas2.get(0));//O método .get(índice) busca o elemento em uma posição específica.
        System.out.println("\n terceira fruta : " + frutas2.get(2));

        int tamanho = frutas2.size();// 4
        System.out.println("\nultima fruta (tamanho - 1) : " + frutas2.get(tamanho - 1));//4 - 1 = 3(damasco), nao existe array(0) , por isso o - 1
        System.out.println("\npenutima fruta (tamanho - 2) : " + frutas2.get(tamanho - 2));
    }
}
