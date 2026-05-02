package DO_whilee;

public class ex02DO_whilee {
    public static void main(String[] args){
        System.out.println("vai rodar numero pares de 0 ate 50");
        int num = 0;
        do {
            if (num % 2 == 0){
                System.out.println("par :" + num);
            }
            num++;
        }while (num <= 50);
    }
}
