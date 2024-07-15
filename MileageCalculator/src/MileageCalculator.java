import java.util.Scanner;
public class MileageCalculator {
    public static void main(String[] args) {
        int miles;
        int gallons;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many miles were driven: ");
        miles = scan.nextInt();
        System.out.println("Enter how much fuel was available: ");
        gallons = scan.nextInt();
        System.out.println("Your MPG is: " + miles / gallons);
    }
}
