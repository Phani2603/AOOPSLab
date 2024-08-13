package Dip;

import java.util.Scanner;

public class Final {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the message service type (email or sms):");
        String serviceType = scanner.nextLine();

        MessageService messageService;
        if (serviceType.equalsIgnoreCase("email")) {
            messageService = new EmailService();
        } else if (serviceType.equalsIgnoreCase("sms")) {
            messageService = new SMSService();
        } else {
            System.out.println("Invalid message service type.");
            return;
        }

        MyApplication myApplication = new MyApplication(messageService);

        System.out.println("Enter the message to send:");
        String message = scanner.nextLine();

        myApplication.sendMessage(message);
    }
}