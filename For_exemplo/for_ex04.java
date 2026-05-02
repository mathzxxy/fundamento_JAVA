package For_exemplo;

public class for_ex04 {
    public static void main(String[] args){
        int soma = 0;
        int numero[]= {1,2,5,8,4,2,5,7,8,5};
        int media;
        for (int i = 0;i < 10;i++){
            soma+=numero[i];
        }
        media = (soma / 10);
        System.out.println("a media de todos os numeros : " + media);
    }
}
