package w9;

public class PrintThree extends Thread {
    private int number;

    public PrintThree(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 3 == 0) {
            System.out.println("Number " + number + " is divisible by 3");
        }
    }
}