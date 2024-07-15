public class ClassTester {
    public static void main(String[] args) {
        NavySailor captain = new NavySailor("Jeremiah","T","Woods","Male","Active Duty", "Submarine", "Captain");
        Person passenger = new Person("James","H","Bond","Male");
        System.out.println("Crewmate on board: ");
        System.out.println(captain.toString());
        System.out.println("Passenger on board: ");
        System.out.println(passenger.toString());
    }
}
