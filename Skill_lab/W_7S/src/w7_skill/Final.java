package w7_skill;

public class Final {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("John Doe", "john.doe@example.com", "123-456-7890");
        Contact contact2 = new Contact("Jane Doe", "jane.doe@example.com", "098-765-4321");
        Contact contact3 = new Contact("Bob Smith", "bob.smith@example.com", "555-123-4567");

        contactManager.addContact(contact1);
        contactManager.addContact(contact2);
        contactManager.addContact(contact3);

        System.out.println("All Contacts:");
        for (Contact contact : contactManager.getAllContacts()) {
            System.out.println(contact.getName() + " - " + contact.getEmail() + " - " + contact.getPhoneNumber());
        }

        System.out.println("Contact by Email: " + contactManager.getContactByEmail("john.doe@example.com").getName());
        System.out.println("Contact by Phone Number: " + contactManager.getContactByPhoneNumber("098-765-4321").getName());
    }
}
