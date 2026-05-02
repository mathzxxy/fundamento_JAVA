package ListaExemplo;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class listaExemplo05 {
    public static void main(String[] args){
        ArrayList<Integer> Numero = new ArrayList<>(Arrays.asList(23,1,17,6,10));
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("banana","maça","banana","cereja","maça","uva"));


        System.out.println("=== Lista original de numeros ===");
        System.out.println(Numero);

        Collections.sort(Numero);

        System.out.println("=== Lista de numeros odernada em ordem Crecente === : "+ Numero );

        System.out.println("=== Lista original de frutas ===");
        System.out.println(frutas);
        Collections.sort(frutas);

        System.out.println("=== frutas odernada em ordem alfabetica ===  :" + frutas );

        Collections.sort(Numero, Collections.reverseOrder());

        System.out.println("=== Lista de numeros odernada em ordem Decrecente === : "+ Numero );
        Collections.reverse(Numero);
        System.out.println("numeros reverse : " + Numero);

        Collections.sort(frutas,Collections.reverseOrder());
        System.out.println("=== frutas apos Reverse === : " + frutas);

        System.out.println("=== contando ocorrencia ===");
        int coOcorrencia = 0;

        for (String fruta : frutas){
            if (fruta.equals("banana")){
                coOcorrencia++;
            }
        }
        System.out.println("ocorrencia de banana : " + coOcorrencia);

        int conNum = 0;

        for (int num : Numero){
            if (num == 1){
                conNum++;
            }
        }
        System.out.println("ocorrencia do numero 1 : " + conNum);

        System.out.println("=== buscando indice ===");

        int indiceBanana = frutas.indexOf("banana");
        if (indiceBanana != -1){
            System.out.println("indice da primeira palavra 'banana' : " + indiceBanana);
        }else {
            System.out.println("'banana' nao esta na lista.");
        }
        int indiceNum23 = Numero.indexOf(23);

        if (indiceNum23 != -1){
            System.out.println("indice do primeiro Numero 23 : " + indiceNum23);
        }else {
            System.out.println("Numeros 23 nao esta na lista.");
        }
        System.out.println("===Fim da Demonstraçao===");
        /*
    Collections.sort(lista): Ordena os elementos da lista em ordem crescente (do menor para o maior).
        Funciona com números, textos e outros tipos que podem ser comparados.

        Exemplo: [5, 2, 8] → vira [2, 5, 8]


    Collections.sort(lista, Collections.reverseOrder()): Ordena os elementos da lista em ordem decrescente (do maior para o menor).

        Primeiro ele entende a ordem normal, depois inverte automaticamente.

        Exemplo: [5, 2, 8] → vira [8, 5, 2]


    Collections.reverse(lista): Inverte a ordem atual dos elementos da lista.

        ⚠️ Importante: não ordena, apenas vira ao contrário do que já está.

        Exemplo:
            Lista original: [5, 2, 8]
            Depois do reverse: [8, 2, 5]

        Ou seja:
            - sort() organiza
            - reverse() só inverte a posição

    lista.indexOf(valor): Retorna a posição (índice) da primeira ocorrência do valor na lista.

        Os índices começam em 0:
            0 → primeiro elemento
            1 → segundo elemento
            2 → terceiro elemento...

        Exemplo:
            lista = [10, 20, 30]

            lista.indexOf(20) → retorna 1


        Se o valor NÃO existir na lista:
            retorna -1

        Exemplo:
            lista.indexOf(50) → retorna -1


        ⚠️ Importante:
            - Ele pega apenas a PRIMEIRA vez que o valor aparece
            - Se tiver repetido, ignora os outros

        Exemplo:
            lista = [10, 20, 10]

            lista.indexOf(10) → retorna 0


        💡 Muito usado para:
            - Saber a posição de um elemento
            - Fazer verificações (ex: se existe na lista)
*/
    }
}
