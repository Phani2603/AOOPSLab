package undo_redo;

import java.util.Scanner;

public class Final {
   
    public static void main(String[] args) {
        Receiver receiver = new TextReceiver();
        Invoker invoker = new Invoker(receiver);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command (add/remove/undo/redo/exit): ");
            String command = scanner.nextLine();

            if (command.equals("exit")) {
                break;
            } else if (command.equals("add")) {
                System.out.println("Enter data to add: ");
                String data = scanner.next();
                invoker.executeCommand(new AddCommand(data, receiver));
                System.out.println("Data: " + invoker.getData());
            } else if (command.equals("remove")) {
                System.out.println("Enter data to remove: ");
                String data = scanner.next();
                invoker.executeCommand(new RemoveCommand(data, receiver));
                System.out.println("Data: " + invoker.getData());
            } else if (command.equals("undo")) {
                invoker.undo();
                System.out.println("Data: " + invoker.getData());
            } else if (command.equals("redo")) {
                invoker.redo();
                System.out.println("Data: " + invoker.getData());
            }
        }
    }
} 

