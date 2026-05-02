package matrizes;

public class matrizEx06 {
    public static void main(String[] args){
        int [][] matriz01 = {
                {1,6,3},
                {2,4,6}
        };
        int [][] matriz02 = {
                {9,8,6},
                {3,1,7}
        };
        int [][]soma = new int[2][3];
        for (int i = 0; i < matriz01.length;i++){
            for (int j = 0; j < matriz01[i].length;j++){
                soma[i][j] = matriz01[i][j] + matriz02[i][j];
            }
        }
        for (int []valor : soma){
            for (int v : valor){
                System.out.print(v + "|");
            }
            System.out.println();
        }
    }
}
