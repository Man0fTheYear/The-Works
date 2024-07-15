public class Main {
    public static void main(String[] args) {
        Elevator lift = new Elevator();

        lift.displayCurrentFloor();
        lift.goUp();
        lift.displayCurrentFloor();
        lift.goUp();
        lift.displayCurrentFloor();
        lift.goUp();
        lift.displayCurrentFloor();
        lift.goDown();
        lift.displayCurrentFloor();
        lift.goDown();
        lift.displayCurrentFloor();
    }
}
