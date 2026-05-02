package vetor_arrays;

public class arrayExemplo04 {
    public static void main(String[] args){
        int []vetor = {7, 7,5,8,3,7,9,6,3,6,7};
        int contador = 0;
        for (int v : vetor){
            if (v == 7){
                contador++;
            }
        }
        System.out.println("o numero 7 aparece " + contador + " vezes.");
    }
}
