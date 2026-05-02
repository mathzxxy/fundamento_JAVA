package ListaExemplo;

import java.util.ArrayList;

//arrayList
public class listaExemplo01 {
    public static void main(String[] args){

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("matheus");// add é para adicionar
        nomes.add("lucas");
        nomes.add("gustavo");

        System.out.println("lista de nome completa(formaçao padrao) :");
        System.out.println(nomes);

        System.out.println("\nlista formata com numeraçao");

        for (int i = 0;i < nomes.size();i++){// nomes.size() vai mostrar a qtd de nomes/palvras que tem na variavel nomes
            System.out.println((i + 1) + " nomes : " + nomes.get(i));//nome.get() acessa o elemento das posiçao
        }
        System.out.println("\ntotal de nomes na lista " + nomes.size());//a qntd de nomes na lista

    }
}
