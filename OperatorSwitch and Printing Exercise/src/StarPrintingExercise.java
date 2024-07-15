public class StarPrintingExercise {
    public static void main(String[] args) {
        int rows = 5;
        for (int index = 1; index < rows; index++) {
             for (int stars = 1; stars <= index; stars++){
                 System.out.print("*");
            }
            System.out.println();
        }
    }
}
