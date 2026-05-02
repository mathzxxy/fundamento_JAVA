package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;

public class listaEx02 {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(5,10,20,15,30));
        int soma = 0;
        for (int n : num){
            soma += n;
        }
        System.out.println("A soma total de todos os numero : " + soma);
    }
}
