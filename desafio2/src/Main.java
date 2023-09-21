import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConversaoTempo conversaoTempo = new ConversaoTempo();

        System.out.print("Digite o numero, em segundos, que deseja converter para data: ");

        try {
            long segundos = scanner.nextLong();
            String dataConvertida = conversaoTempo.converterSegundosEmData(segundos);
            System.out.println(dataConvertida);
        }catch (InputMismatchException e){
            System.err.println("\nERRO: Você deve informar um número inteiro!");
        }
    }
}
