package ListaExemplo;

//exercicio para remover nomes repetidos no ARRays.

import java.util.ArrayList;
import java.util.Scanner;

public class listaEx05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> nomeUnico = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("digite nome :");
            String nome = sc.nextLine();
            nomes.add(nome);
        }
        for (String n : nomes) {
            if (!nomeUnico.contains(n)){
                nomeUnico.add(n);
            }
        }
        System.out.println("\n nome sem repetiçao : " + nomeUnico);
    }
}