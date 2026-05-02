package ListaExemplo;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListaExemplo07 {
    public static void main(String[] args){
        ArrayList<Integer> DobroTadicional = new ArrayList<>();

        for (int i = 0;i < 5; i++) {
            int dobro = i * 2;
            DobroTadicional.add(dobro);
        }
        System.out.println("Dobrando os numeros com for tradicional : " + DobroTadicional);

        ArrayList<Integer> dobrosComStream = IntStream.range(0,5) // cria números de 0 até 4
                .map(x -> x * 2) // dobra cada número
                .boxed() // transforma int em Integer (objeto)
                .collect(Collectors.toCollection(ArrayList::new)); // joga tudo em um ArrayList

        System.out.println("dobros com list comprehesion (stream) : " + dobrosComStream);

        // Versão mais enxuta (menos código)
        System.out.println("dobros com list comprehesion (enxuto) : " +
                        IntStream.range(0,5) // gera de 0 até 4
                                .map(x -> x * 2) // dobra
                                .boxed() // vira objeto
                                .collect(Collectors.toList()) // cria uma lista direto
                );
    }
}
