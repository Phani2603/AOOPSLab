package OCP;

import java.util.Scanner;

public class ShapeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose a shape:");
            System.out.println("1. Rectangle");
            System.out.println("2. Circle");
            System.out.print("Enter your choice (1/2): ");
            int choice = scanner.nextInt();

            Shape shape = null;

            if (choice == 1) {
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
            } else if (choice == 2) {
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
            } else {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            double area = shape.calculateArea();
            System.out.println("Area: " + area);

            System.out.print("Do you want to calculate the area of another shape? (y/n): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
