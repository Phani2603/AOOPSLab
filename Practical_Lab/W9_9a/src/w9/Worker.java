package w9;
public class Worker extends Thread {
    private int number;

    public Worker(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        PrintTwo printTwo = new PrintTwo(number);
        PrintThree printThree = new PrintThree(number);
        PrintFour printFour = new PrintFour(number);
        PrintFive printFive = new PrintFive(number);
        PrintNumber printNumber = new PrintNumber(number);

        printTwo.start();
        printThree.start();
        printFour.start();
        printFive.start();
        printNumber.start();

        try {
            printTwo.join();
            printThree.join();
            printFour.join();
            printFive.join();
            printNumber.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}