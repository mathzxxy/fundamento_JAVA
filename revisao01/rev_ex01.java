package revisao01;

public class rev_ex01 {
    public static void main(String[] args){
        for (int i = 1;i <= 100;i++){
            if (i % 7 == 0){
                System.out.println(i + " é um numero multiplo a 7");
                break;
            }
            System.out.println(i);
        }
    }
}
