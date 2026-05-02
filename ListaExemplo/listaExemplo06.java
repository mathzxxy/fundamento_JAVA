package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listaExemplo06 {
    public static void main(String[] args){
        System.out.println("===Sling de Listas em java(simulando ===");
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        System.out.println("Lista original : "+ num);

        List<Integer> SubConjunto = num.subList(1,4);
        System.out.println("subconjunto [1.4] : " + SubConjunto);//vai do indice 1 ao 4

        List<Integer> PrimeiroElemento = num.subList(0,2);
        System.out.println("Primeiros elementos[0.2] : " + PrimeiroElemento);//vai do indece 0 ate 2

        List<Integer> elementosDepoisde2 = num.subList(2,num.size());
        System.out.println("elementos depois do indice [2] : " + elementosDepoisde2);

        ArrayList<Integer> elementosAlterados = new ArrayList<>();
        for (int i = 0;i < num.size();i+=2){
            elementosAlterados.add(num.get(i));
        }
        System.out.println("elementos alternados : " + elementosAlterados);
        ArrayList<Integer> subConjuntoAlternado = new ArrayList<>();

        for (int i = 2; i < 8;i+=2){
            subConjuntoAlternado.add(num.get(i));
        }
        System.out.println("subconjunto alternado [2:8:2] : " + subConjuntoAlternado);
        System.out.println("minha lista [2] = " + num.get(2));
        System.out.println("minha lista [4] = " + num.get(4));
        System.out.println("minha lista [6] = " + num.get(6));
/*
    List<Integer> subConjunto = num.subList(inicio, fim):
        Cria uma "sublista" (um pedaço da lista original).

        inicio → posição onde começa (inclui esse índice)
        fim → posição onde termina (NÃO inclui esse índice)

        Exemplo:
            num = [10, 20, 30, 40, 50]

            num.subList(1, 4) → pega do índice 1 até o 3

            Resultado:
                [20, 30, 40]


        ⚠️ Importante:
            - O índice começa em 0
            - O segundo número (fim) é EXCLUSIVO
            - Ou seja: vai até (fim - 1)


        ⚠️ Muito importante (pegadinha):
            A subList NÃO é uma nova lista independente,
            ela está ligada à lista original.

        Exemplo:
            Se você alterar a sublista,
            a lista original também muda.

            E vice-versa.


        💡 Uso comum:
            - Pegar parte de uma lista
            - Trabalhar com intervalos de dados
            - Fazer cortes (tipo paginação, rankings, etc.)
*/
    }
}
