package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;

public class ListaExemplo04 {
    public static void main(String[] args){

        System.out.println("=== 1. Adicionar Elementos ===");

        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("maça","banana"));
        frutas.add("cereja");//adicionar mais uma posiçao no ArrayList

        System.out.println("add (append) : " + frutas);

        frutas = new ArrayList<>(Arrays.asList("maça" ,"banana","cereja"));
        frutas.add(1,"abacate");//abacate ocupou a posiçao 1, o resto foi empurrada pra frente.
        System.out.println("add (index,valor) (insert):" + frutas);

        System.out.println("=== 2. Remover Elementos ===");

        frutas = new ArrayList<>(Arrays.asList("maça" ,"banana","cereja"));

        frutas.remove("banana");//remove a String banana

        System.out.println("Remove(valor : " + frutas);
        frutas = new ArrayList<>(Arrays.asList("maça" ,"banana","cereja"));

        frutas.remove(1);//remove pela  posiçao 1 = "banana"

        System.out.println("Remove(index : " + frutas);

        frutas.remove(frutas.size() - 1);//pega o tamanho total com Size() e tira -1

        System.out.println("remove o ultimo " + frutas);

        System.out.println("=== 3. Concaternas Listas ===");

        ArrayList<Integer> Lista1 = new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> Lista2 = new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> uniao = new ArrayList<>((Lista1));//uniao recebe primeiro a Lista1
        uniao.addAll(Lista2);//adiciona o Array da Lista 2,ja ta lista1 e adiciona MAIS lista2

        System.out.println("concatenaçao ( + / extend ) : " + uniao);

         Lista1 = new ArrayList<>(Arrays.asList(1,2,3));
         Lista2 = new ArrayList<>(Arrays.asList(4,5,6));
         Lista1.addAll(Lista2); // adiciona o numeros da lista2 na lista1.

         System.out.println("AddALL (extend) : " + Lista1);

         System.out.println("=== 4. Repetir Lista ===");
         ArrayList<String> rep = new ArrayList<>();

         for (int i = 0; i < 3;i++){
             rep.add("a");
             rep.add("b");
         }
         System.out.println("Repetiçao manual (*) : " + rep);

         System.out.println("=== 5. Verificar se um item esta na lista ===");

         frutas = new ArrayList<>(Arrays.asList("maça","banana","cereja"));
         System.out.println("contem 'banana' ? : " + frutas.contains("banana"));// ver se contem a palavra na lista.
        System.out.println("contem 'uva' ? : " + frutas.contains("uva"));//vai verificar na lista, so que não tem, entao vai dar falso
        System.out.println("=== fim de operaçoes ===");
    }
}
