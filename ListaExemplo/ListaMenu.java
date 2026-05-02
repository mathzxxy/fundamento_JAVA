package ListaExemplo;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaMenu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> Lista = new ArrayList<>();
        int opçao;
        do {
            System.out.println("\n === Menu ====");
            System.out.println("1 - adicionar item");
            System.out.println("2 - remove item");
            System.out.println("3 - alterar item");
            System.out.println("4 - listar item");
            System.out.println("5 - limpar lista");
            System.out.println("6 - sair ");
            System.out.println("Escolha uma opçao");
            opçao = sc.nextInt();
            sc.nextLine();
            switch (opçao){
                case 1:
                    System.out.print("digite o item que quer adicionar ");
                    String novoItem = sc.nextLine();
                    Lista.add(novoItem);
                    System.out.println("item adicionado com sucesso!");
                    break;
                case 2:
                    if (Lista.isEmpty()){// verifica se a lista está vazia (true ou false) true = vazia , false = tem item
                        System.out.println("A lista esta vazia");
                    }else{
                        System.out.println("digite o nome do item que quer remover : ");
                        String itemRemover = sc.nextLine();
                        if (Lista.remove(itemRemover)){
                            System.out.println("item removido com sucesso!");
                        }else {
                            System.out.println("item nao encontrado.");
                        }
                    }
                    break;
                case 3:
                    if (Lista.isEmpty()){
                        System.out.println("A lista esta vazia!");
                    }else {
                        System.out.println("digite o nome do item que deseja alterar ");
                        String itemAntigo = sc.nextLine();
                        if (Lista.contains(itemAntigo)){ // verifica se existe na lista
                            System.out.println("digite o novo item que quer adicionar");
                            String itemAlterado = sc.nextLine();
                            int indice = Lista.indexOf(itemAntigo);// pega a posição do item
                            Lista.set(indice,itemAlterado);// substitui o valor nessa posição
                            System.out.println("item alterado com sucesso!");
                        }else {
                            System.out.println("item nao encotrado.");
                        }
                    }
                    break;
                case 4:
                    if (Lista.isEmpty()){
                        System.out.println("A lista esta vazia!");
                    }else {
                        System.out.println("itens da Lista ");
                        for (int i = 0;i < Lista.size();i++){
                            System.out.println((i + 1) + " . " + Lista.get(i));
                        }
                    }
                    break;
                case 5:
                    Lista.clear();// remove TODOS os itens da lista
                    System.out.println("lista limpa com sucesso!");
                    break;
                case 6:
                    System.out.println("saindo do programa.");
                    break;
                default:
                    System.out.println("opçao invalida. tente novamente.");
                    break;
            }
        }while (opçao != 6);
        sc.close();
    }
}
