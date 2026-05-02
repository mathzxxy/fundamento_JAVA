package vetor_arrays;

public class arrayExemplo05 {
    public static void main(String[] args){
        int[]vetor1 = {1,2,3,4,5};
        int[]vetor2 = {5,4,3,2,1};
        int[]soma = new int[5];
        for (int i = 0; i < 5;i++){
            soma[i] = vetor1[i] + vetor2[i];
        }
        for (int valor : soma){
            System.out.println(valor);
        }
    }
}
