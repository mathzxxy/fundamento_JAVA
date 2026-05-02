package vetor_arrays;

public class arrayExemplo01 {
    public static void main(String[] args){

        int []numeros = {10,20,30,40,50};// para poder ativar a array

        System.out.println("exemplo 01 de array :");

        for (int i = 0; i < numeros.length;i++){

            System.out.println("posiçao " + i + " : " + numeros[i]);

        }
        System.out.println("\n--------------------------------------- \n");
        int []idade = new int[3];
        idade[0] = 10;
        idade[1] = 15;
        idade[2] = 13;

        System.out.println("exemplo 02 de array :");

        for (int i = 0; i < idade.length;i++){
            System.out.println("idade " + (i + 1) + " : " + idade[i]);
        }
        System.out.println("\n--------------------------------------- \n");
        int []valor = { 5,20,15,40,8};
        int soma = 0;
        System.out.println("exemplo 03 de array :");

        for (int i = 0; i < valor.length;i++){

            soma += valor[i];

        }
        System.out.println("a soma dos valores é : " + soma);

        System.out.println("\n--------------------------------------- \n");

        int[]dado = {22,17,35,9,41};
        int maior = dado[0];
        System.out.println("exemplo 04 de array :");
        for (int i = 0; i < dado.length;i++){
            if (dado[i] > maior){
                maior = dado[i];
            }
        }
        System.out.println(" o maior numero é : " + maior);
        System.out.println("\n--------------------------------------- \n");
int []numero2 = {3,12,7,18,2,25};
int contador = 0;
for (int i = 0;i < numero2.length;i++){
    if (numero2[i] > 10){
        contador++;
    }
}
System.out.println("exemplo 05 - quantos numeros sao maiores que 10 : " + contador);
    }
}
