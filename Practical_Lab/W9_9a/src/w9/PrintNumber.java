package w9;
public class PrintNumber extends Thread {
    private int number;

    public PrintNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        if (number % 2 != 0 && number % 3 != 0 && number % 4 != 0 && number % 5 != 0) {
            System.out.println("Number " + number);
        }
    }
}