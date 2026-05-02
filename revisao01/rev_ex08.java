package revisao01;

import java.util.Random;

public class rev_ex08 {
    public static void main(String[] args){
        while (true){
            Random al = new Random();
            int i = al.nextInt(20);
            System.out.println("numeros gerados : " + i);
            if (i == 10){
                System.out.println("numero 10 encontrado, encerrado...");
                break;
            }
        }
    }
}
