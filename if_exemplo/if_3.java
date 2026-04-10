package if_exemplo;

public class if_3 {
    public static void main(String[] args) {
        double nota = 6.0;
        if (nota >= 7) {
            System.out.println("Aluno aprovado");
        }else if(nota >= 5) {
            System.out.println("Aluno recuperaçao");
        }else {
            System.out.println("Aluno reprovado");
        }
    }
}