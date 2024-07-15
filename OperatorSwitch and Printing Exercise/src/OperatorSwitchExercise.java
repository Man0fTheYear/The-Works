import java.util.Scanner;
public class OperatorSwitchExercise {
    public static void main(String[] args) {
        char inputOperator;
        int firstNumber;
        int secondNumber;
        int finalNumber;

        Scanner scan = new Scanner(System.in);

        System.out.println("Select an operator: /, -, *, +, or %.");
        inputOperator = scan.next().charAt(0);;


        System.out.println("Enter the first number.");
        firstNumber = scan.nextInt();

        System.out.println("Enter the second number.");
        secondNumber = scan.nextInt();

        switch (inputOperator) {

            case '/':
                finalNumber = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + finalNumber);
                break;

            case '-':
                finalNumber = firstNumber - secondNumber;
                System.out.println(firstNumber + " - " + secondNumber + " = " + finalNumber);
                break;

            case '*':
                finalNumber = firstNumber * secondNumber;
                System.out.println(firstNumber + " * " + secondNumber + " = " + finalNumber);
                break;

            case '+':
                finalNumber = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + finalNumber);
                break;

            case '%':
                finalNumber = firstNumber % secondNumber;
                System.out.println(firstNumber + " % " + secondNumber + " = " + finalNumber);
                break;

            default:
                System.out.println("Invalid operator entered.");
                break;
        }
    }
}

