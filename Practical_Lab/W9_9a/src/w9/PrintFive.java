package w9;

public class PrintFive extends Thread {
    private int number;

    public PrintFive(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 5 == 0) {
            System.out.println("Number " + number + " is divisible by 5");
        }
    }
}