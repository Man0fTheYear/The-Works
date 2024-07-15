import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        Reverse_Digits(inputNumber);
    }

    public static void Reverse_Digits(int inputNumber) {
        if (inputNumber == 0) {
            // Condition to stop recursive call.
            System.out.println(" Reversing process complete.");
            return;
        } else {
            int remainder = inputNumber % 10;
            System.out.print(remainder);
            Reverse_Digits(inputNumber / 10);
        }
    }
}
