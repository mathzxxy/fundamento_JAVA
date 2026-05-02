package ListaExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class listaEx03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nome = new ArrayList<>(Arrays.asList("matheus","gustavo","lucas"));
        System.out.println("digite o nome da lista ");
        String escolha = sc.nextLine();
        if (nome.contains(escolha)){
            System.out.println("nome encontrado : " + escolha);
        }else {
            System.out.println("nome nao encontrado");
        }
        sc.close();
        }
    }

