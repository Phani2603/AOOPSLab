package ISP;

public class Final {
    public static void main(String[] args) {
        Worker robot = new Robot();
        robot.work(); // Output: Robot is working...

        Worker human = new Human();
        human.work(); // Output: Human is working...

        Eater humanEater = new Human();
        humanEater.eat(); // Output: Human is eating...

        try {
            Eater robotEater = (Eater) new Robot();
            robotEater.eat(); // This will throw a ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Robot cannot eat");
        }
    }
}