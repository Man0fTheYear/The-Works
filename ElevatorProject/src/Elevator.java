public class Elevator {
int currentFloor = 1;

public void goUp() {
    if(currentFloor == 3) {
        System.out.println("Maximum floor reached, cannot go higher.");
    } else {
        System.out.println("Going up.");
        currentFloor = currentFloor + 1;
    }
}

public void goDown() {
    if(currentFloor == 1) {
        System.out.println("Ground floor reached, cannot go lower.");
    } else {
        System.out.println("Going down.");
        currentFloor = currentFloor - 1;
    }
}

public void displayCurrentFloor() {
    System.out.println("You are presently on floor " + currentFloor);
}
}
