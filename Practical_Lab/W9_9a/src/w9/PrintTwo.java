package w9;
public class PrintTwo extends Thread {
    private int number;

    public PrintTwo(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is divisible by 2");
        }
    }
}