package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listaExemplo02 {
    public static void main(String[] args){
        System.out.println("----lista de notas de um aluno----");
        ArrayList<Integer> notasAluno = new ArrayList<>(Arrays.asList(85,90,78,92,88));
        //ArrayList<TipoDaVariavel> nome da variavel = new ArrayList<>()
        /*Arrays.asList(...) = Cria uma lista.
        new ArrayList<>() = cria memorias da lista = (Arrays.asList(valores ou nomes));
        notasAluno = Nome da variável (você pode escolher qualquer nome)
        ArrayList<Integer> = Define o tipo da lista <Integer> → só aceita números inteiros
         */
        System.out.println("notas do aluno : " + notasAluno);

        String mensagem = "ola";

        System.out.println("Menssagem : " + mensagem);

        System.out.println("Tipo : String");

        ArrayList<String> ListaDeStrings = new ArrayList<>(Arrays.asList("ola" , "mundo"));
        //ArrayList<String> = Define o tipo da lista <String> → só aceita letras/palavras

        System.out.println("lista de String : " + ListaDeStrings);

        ArrayList<Integer> Lista = new ArrayList<>(Arrays.asList(1,2,3));
        //set faz alteraçao.
        Lista.set(0,100);//posiçao 0 recebia o 1, mais a mudaçao com esse comando, fez a posiçao 0 receber o valor de 100.
        Lista.set(1,50);//posiçao 1 recebia o 2, mais a mudaçao com esse comando, fez a posiçao 1 receber o valor de 50.
        System.out.println("Lista alterada : " + Lista);

    }
}
