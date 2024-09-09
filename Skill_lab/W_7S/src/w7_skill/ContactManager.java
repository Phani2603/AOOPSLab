package w7_skill;

import java.util.*;

public class ContactManager {
    private Set<Contact> contacts; 
    private Map<String, Contact> contactByEmail; 
    private Map<String, Contact> contactByPhoneNumber; 
    public ContactManager() {
        contacts = new HashSet<>();
        contactByEmail = new HashMap<>();
        contactByPhoneNumber = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (!contacts.contains(contact)) {
            contacts.add(contact);
            contactByEmail.put(contact.getEmail(), contact);
            contactByPhoneNumber.put(contact.getPhoneNumber(), contact);
        }
    }

    public Contact getContactByEmail(String email) {
        return contactByEmail.get(email);
    }

    public Contact getContactByPhoneNumber(String phoneNumber) {
        return contactByPhoneNumber.get(phoneNumber);
    }

    public Set<Contact> getAllContacts() {
        return contacts;
    }
}