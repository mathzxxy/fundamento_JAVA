package matrizes;

public class matrizEx03 {
    public static void main(String[] args){
        int[][]matriz = {
                {10,3,9},
                {5,8,1}
        };
        int soma = 0;
        int total = 0;
        double media;

        for (int[] linha : matriz){
            for (int valor : linha){
                soma+=valor;
                total++;
            }
        }
        media = (double) soma / total;
        System.out.println(media);
    }
}
