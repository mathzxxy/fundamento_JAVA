package ListaExemplo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ListaExemplo08 {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(1,7,5,15,8,14,20));
        System.out.println("Lista de numeros : " + num);

        int tamanho = num.size();

        System.out.println("numeros de elementos na lista : " + tamanho);

        int maior = Collections.max(num);// pega o maior valor da lista
        System.out.println("o maior numero da lista : " + maior);

        int menor = Collections.min(num);// pega o menor valor da lista
        System.out.println("o menor numero da lista : " + menor);

        int somaTotal = 0;
        for (int n : num){
            somaTotal += n;
        }
        System.out.println("A soma de todos os numeros é : "+ somaTotal);
    }
}
