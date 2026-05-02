package matrizes;

public class matrizEx04 {
    public static void main(String[] args){
        int [][]matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int con = 0;
        for (int[] v : matriz){
            for (int valor : v){
                if (valor % 2 == 0){
                    con++;
                }
            }
        }
        System.out.println("contem " + con + " numeros pares");
    }

}
