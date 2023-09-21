import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SequenciaFibonacci fibonacci = new SequenciaFibonacci();

        try {
            long numero;
            do{
                System.out.print("Digite um número inteiro: ");
                numero = scanner.nextLong();
                if(numero < 0){
                    System.out.println("\nPor favor, digite um número positivo\n");
                } else {
                    long resultadoFibonacci = fibonacci.calcularFibonacci(numero);
                    System.out.println("Fib = " + resultadoFibonacci);
                }
            }while (numero < 0);
        } catch (InputMismatchException e){
            System.err.println("\nERRO: Você deve informar um número inteiro!");
        }
    }
}