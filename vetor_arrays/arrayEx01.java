package vetor_arrays;

public class arrayEx01 {
    public static void main(String[] args){
        int []numeros = {1,2,3,4,5};
        int i = 0;
        for (int con : numeros){
            System.out.println("posiçao " + i + " : " + con);
            i++;
        }
    }
}
