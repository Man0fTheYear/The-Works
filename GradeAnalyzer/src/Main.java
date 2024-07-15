import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int[] gradeArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < gradeArray.length; index++) {
            System.out.println("Please enter the next grade for the array.");
            int number = scanner.nextInt();
            if (number > 0) {
                gradeArray[index] = number;
                sum = sum + gradeArray[index];
            } else
                break;
        }

      int average = sum/ gradeArray.length;
        System.out.println("Grades greater than the average: ");
      for(int index = 0; index < gradeArray.length; index++) {
          if(gradeArray[index] > average) {
              System.out.print(gradeArray[index] + ", ");
          }
      }
        System.out.println();
        System.out.println("Grades less than the average: ");
        for(int index = 0; index < gradeArray.length; index++) {
            if(gradeArray[index] < average) {
                System.out.print(gradeArray[index] + ", ");
            }
        }
        System.out.println();
        System.out.println("Grades equal to the average: ");
        for(int index = 0; index < gradeArray.length; index++) {
            if(gradeArray[index] == average) {
                System.out.print(gradeArray[index] + ", ");
            }
        }
    }
}
