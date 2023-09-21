public class SequenciaFibonacci {
    public long calcularFibonacci(long n) {
        if (n < 2) {
            return n;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
}
