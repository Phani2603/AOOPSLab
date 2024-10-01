package LSP;

public class Final {
    public static void main(String[] args) {
        Bird bird = new Bird() {
            @Override
            public void fly() {
                System.out.println("Flying...");
            }
        };

        bird.fly(); // Output: Flying...

        bird = new Ostrich();
        bird.fly(); // Throws UnsupportedOperationException: Ostriches cannot fly
    }
}