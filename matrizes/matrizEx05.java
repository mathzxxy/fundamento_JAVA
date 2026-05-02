package matrizes;

public class matrizEx05 {
    public static void main(String[] args){
        int [][]matriz01 = {
                {1,3,2},
                {6,7,4},
                {9,5,1}
        };
        for (int i = 0;i < matriz01.length;i++){
            for (int j = 0;j < matriz01[i].length;j++){
               int temp = matriz01[2][i];
               matriz01[2][i] = matriz01[0][i];
               matriz01[0][i] = temp;
            }
        }
        for (int []v : matriz01){
            for (int troca : v){
                System.out.print(troca);
            }
            System.out.println();
        }
    }
}
