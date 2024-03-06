import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*para o usuário digitar*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para verificar: ");
        int number = scanner.nextInt();

        /*número aleatório
        Random random = new Random();
        int number = random.nextInt(1000);
        System.out.println("Número: "+number);*/

        if (isFibonacci(number)) {
            System.out.println("O número "+ number + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número "+ number + " não pertence à sequência de Fibonacci.");
        }
    }

    public static boolean isFibonacci(int num) {
        int a = 0;
        int b = 1;

        if (num == a || num == b) {
            return true;
        }

        int sum = a + b;
        while (sum <= num) {
            if (sum == num) {
                return true;
            }
            a = b;
            b = sum;
            sum = a + b;
        }

        return false;
    }
}