package vetor_arrays;

public class arrayEx03 {
    public static void main(String[] args){
        int []num = {10,20,30,40,50,60};
System.out.println("elementos em ordem invertida :");
        for (int i = num.length -1; i >= 0; i--){
            System.out.println(num[i]);
        }
    }
}
