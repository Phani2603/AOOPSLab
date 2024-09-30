package w9;

public class PrintFour extends Thread {
    private int number;

    public PrintFour(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 4 == 0) {
            System.out.println("Number " + number + " is divisible by 4");
        }
    }
}