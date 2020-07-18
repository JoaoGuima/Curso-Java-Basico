import java.util.ArrayList;
import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        Scanner leitorDeVariaveis = new Scanner(System.in);

        System.out.println("Quantos números você deseja informar: ");
        Integer quantidadeNumeros = leitorDeVariaveis.nextInt();

        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        for (int i = 0; i < quantidadeNumeros; i++) {
            leitorDeVariaveis = new Scanner(System.in);

            System.out.print("Digite um número: ");
            Integer numeroInformado = leitorDeVariaveis.nextInt();
            listaDeNumeros.add(numeroInformado);
        }

        for (Integer itemDaLista : listaDeNumeros) {
            System.out.println(itemDaLista);
        }

    }
}
