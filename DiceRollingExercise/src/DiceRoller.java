import java.security.SecureRandom;
public class DiceRoller {
    public static void main(String[] args) {
        SecureRandom randomizer = new SecureRandom();
        int[] rollfrequency = new int [10];
        for(int index = 0; index < 1000000; index++) {
            ++rollfrequency[0 + randomizer.nextInt(10)];
        }

        System.out.printf("%s%10s%n", "Die_Face", "  Frequency_Count");

        for (int dieface = 0; dieface < rollfrequency.length; dieface++) {
           System.out.printf("%4d%12d%n", 1+dieface, rollfrequency[dieface]);
        }
    }
}
