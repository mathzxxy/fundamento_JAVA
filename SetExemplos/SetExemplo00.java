package SetExemplos;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo00 {
    public static void main(String[] args){
        Set<String> frutas = new HashSet<>();
        frutas.add("maça");
        frutas.add("banana");
        frutas.add("goiaba");
        frutas.add("manga");
        frutas.add("abacate");
        frutas.add("maça");

        System.out.println("frutas : " + frutas);

        if (frutas.contains("banana")){
            System.out.println("banana ésta presente.");
        }

        frutas.remove("manga");

        System.out.println("apos remover manga : " + frutas);

        if (frutas.contains("goiaba")){
            frutas.remove("goiaba");
            frutas.add("melancia");
        }
        System.out.println("Apos editar goiaba para melancia : " + frutas);

        Set<String> filtradas = new HashSet<>();

        for (String fruta : frutas){
            if (fruta.startsWith("m")){
                filtradas.add(fruta);
            }
        }
        System.out.println("frutas filtradas que começa com a letra M : " + filtradas);

        Set<String> frutas2 = new HashSet<>();
        frutas2.add("uva");
        frutas2.add("jaca");
        frutas2.add("pitanga");
        frutas.addAll(frutas2);

        System.out.println("conjuntos de frutas : " + frutas);

        Set<String> intersecao = new HashSet<>(frutas);//pegou todas palavras
        intersecao.retainAll(frutas2);//vai separar as palavras da variavel frutas2 da de frutas.

        System.out.println("intersecao : " + intersecao);

        Set<String> diferança = new HashSet<>(frutas);
        diferança.removeAll(frutas2);

        System.out.println("diferença : " + diferança);

        frutas.clear();//limpar arrays

        System.out.println("apos limpa : " + frutas);
    }
}
