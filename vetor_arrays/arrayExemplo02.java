package vetor_arrays;

public class arrayExemplo02 {
    public static void main(String[] args){
        int[]original = {10,20,30,40,50};
        int[]copia = new int[5];
        for (int i = 0;i < original.length;i++){
            copia[i] = original[i];
        }
        // Para cada valor dentro de "copia", pega esse valor e executa o código abaixo
        for (int valor : copia){// A cada volta, "valor" recebe um item de "copia"
            System.out.println(valor);
        }
    }
}
