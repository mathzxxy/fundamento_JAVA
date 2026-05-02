package For_exemplo;

public class for_ex01 {
    public static void main(String[] args){
        for (int i = 1;i <= 99;i++){
            if (i % 2 == 0){
                i++;
            }
            System.out.println("impar = " + i);
        }
    }
}
