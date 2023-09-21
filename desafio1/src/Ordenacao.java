import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ordenacao {
    private final ArrayList<Integer> numerosPares = new ArrayList<>();
    private final ArrayList<Integer> numerosImpares = new ArrayList<>();
    private final Scanner scanner = new Scanner(System.in);

    public int lerQuantidade() {
        int quantidade;

        do {
            System.out.print("Digite a quantidade de numeros que deseja fornecer: ");
            quantidade = scanner.nextInt();
            if (quantidade <= 1 || quantidade >= 10000) {
                System.out.println("\nPor favor, digite um número inteiro maior que 1 e menor que 10000\n");
            }
        } while (quantidade <= 1 || quantidade >= 10000);
        return quantidade;
    }

    private void adicionarNaLista(int numero) {
        if (numero % 2 == 0) {
            numerosPares.add(numero);
        } else {
            numerosImpares.add(numero);
        }
    }

    public void lerNumeros(int quantidade) {
        for (int i = 1; i <= quantidade; i++) {
            int numero;

            do {
                System.out.print("Digite o " + i + "º número: ");
                numero = scanner.nextInt();
                if (numero < 0) {
                    System.out.println("\nPor favor, digite um número positivo\n");
                } else {
                    adicionarNaLista(numero);
                }
            } while (numero < 0);
        }
    }

    public void ordenarListas() {
        Collections.sort(numerosPares);
        Collections.sort(numerosImpares);
        Collections.reverse(numerosImpares);
    }

    public void mostrarNumeros() {
        System.out.println("\nNUMEROS PARES");
        for (int numero : numerosPares) {
            System.out.println(numero);
        }

        System.out.println("\nNUMEROS IPARES");
        for (int numero : numerosImpares) {
            System.out.println(numero);
        }
    }
}
