package whileeExemplo;
//while = enquanto
public class whileeExemplo1 {
    public static void main(String[] args) {
        System.out.println("\n 1 - contar de 1 ate 5\n");
        int i = 1;
        while (i <= 5){
            System.out.println("Contador :" + i);
            i++;
        }

        System.out.println("\n 2 - CONTAGEM REGRESSIVA DE 5 ATE 1\n");
        int j = 5;
        while (1 <= j){
            System.out.println("numero : " + j);
            j--;
        }

        System.out.println("\n 3 - somas dos numeros 1 ate 10\n");
        int soma = 0;
        int S = 1;

        while (S <= 10){
            soma += S;
            S++;
        }
        System.out.println(" a soma recebe 1 ate 10 é : " + soma);
    }
}
