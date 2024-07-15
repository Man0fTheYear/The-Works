import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birthmonth, birthday, birthyear;
        int currentmonth, currentday, currentyear;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a birth month in MM format. ");
        birthmonth = scanner.nextInt();
        System.out.println("Please enter a birth day in DD format. ");
        birthday = scanner.nextInt();
        System.out.println("Please enter a birth year in YYYY format. ");
        birthyear = scanner.nextInt();
        System.out.println("Please enter the current month in MM format. ");
        currentmonth = scanner.nextInt();
        System.out.println("Please enter the current day in DD format. ");
        currentday = scanner.nextInt();
        System.out.println("Please enter the current year in YYYY format. ");
        currentyear = scanner.nextInt();
        //System.out.println( month + "" + day + "" + year );
        int result = CalculateAge(birthyear, birthmonth, birthday, currentyear, currentmonth, currentday);
        System.out.println("User's age is: " + result);


    }
    public static int CalculateAge(int birthyear, int birthmonth, int birthday, int currentyear, int currentmonth, int currentday) {
        int convertedBD = (birthyear * 10000) + (birthmonth * 100) + birthday;
        int convertedCD = (currentyear * 10000) + (currentmonth * 100) + currentday;
        int difference = convertedCD - convertedBD;
        int result = difference/ 10000;
        return result;
    }


}
