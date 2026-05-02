package ListaExemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class listaEx01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String opçao;
        int op = 0;
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println("Lista de nomes , digite 1 para sair do loop");
        do {
            System.out.println("digite o nome : ");
            opçao = sc.nextLine();
            nomes.add(opçao);
            if (opçao.equals("1")){
                op++;
            }
        }while (op != 1);
        nomes.remove("1");
        for (String n : nomes){
            System.out.println("nomes : " + n);
        }
    }
}
