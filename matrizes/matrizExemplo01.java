package matrizes;

public class matrizExemplo01 {
    public static void main(String[] args) {
        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("exemplo 01 de matrizes");

        for (int linha = 0; linha < 3; linha++) {

            for (int coluna = 0; coluna < 3; coluna++) {
// System.out.print(): mostra o conteúdo sem quebrar linha
// System.out.println(): mostra o conteúdo e vai para a próxima linha
                System.out.print(matriz[linha][coluna] + " ");
            }
            System.out.println();
        }
        System.out.println("\n --------------------------- \n");

        System.out.println("Exemplo 02");
        int[][] tabela = new int[2][3];
        tabela[0][0] = 10;
        tabela[0][1] = 15;
        tabela[0][2] = 20;

        tabela[1][0] = 25;
        tabela[1][1] = 30;
        tabela[1][2] = 35;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tabela[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\n --------------------------- \n");

        int[][] dados = {{15, 20}, {5, 10}};
        int soma = 0;
        for (int c = 0; c < dados.length; c++) {
            for (int d = 0; d < dados.length; d++) {
                soma += dados[c][d];
            }
        }
        System.out.println("exemplo 03 - soma de todos os elementos das matrizes : " + soma);

        System.out.println("\n --------------------------- \n");

        int[][] num = {
                {5, 4, 9},
                {3, 6, 10}
        };
        int maior = num[0][0];

        for (int i = 0; i < num.length; i++) {
            // num[i] = linha atual da matriz
            // num[i].length = quantidade de colunas dessa linha
            for (int j = 0; j < num[i].length; j++) {
                if (num[i][j] > maior) {
                    maior = num[i][j];
                }
            }
        }
        System.out.println("exemplo 04 - descobrir qual numero é o maior dos elementos : " + maior);

        System.out.println("\n ------------------------------------ \n");
        int[][] quadrado = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0;i < quadrado.length;i++){
            System.out.println(quadrado[i][i]);// vai percorrer [0][0] , [1][1] , [2][2] = diagonal;
        }
    }
}

