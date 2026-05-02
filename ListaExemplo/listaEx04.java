package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class listaEx04 {
    public static void main(String[] args){
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(10,25,7,40,13));
        int maior = Collections.max(num);

        System.out.println("o maior numero da lista: " + maior);

    }
}
