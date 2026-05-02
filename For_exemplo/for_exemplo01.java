package For_exemplo;

public class for_exemplo01 {
    public static void main(String[] args){
        System.out.println("ordem de 1 a 10");
        System.out.println("\n");
        for (int i = 1; i <= 10; i++){
            System.out.println("valor de i = " + i);
        }
        System.out.println("\n");
        System.out.println("ordem de 10 a 1");
        System.out.println("\n");
        for (int i = 10;i >= 1;i--){
            System.out.println("valor de i = " + i);
        }
        System.out.println("\n");
        System.out.println("valores de par");
        System.out.println("\n");
        for (int i = 1;i <= 20;i++){
            if (i % 2 == 0){
                System.out.println("valor de par: "+ i);
            }
        }
        System.out.println("\n");
        System.out.println("A soma de 1 ate o 100");
        int soma = 0;
        for (int i = 1;i <= 100;i++){
            soma += i;
        }
        System.out.println("a soma de 1 ate 100 : "+ soma);
    }
}
