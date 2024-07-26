import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
    private List<Contact> contacts;

    public AddressBook() {
        this.contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public Contact findContactByName(String firstName, String lastName) {
        for (Contact contact : contacts) {
            if (contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName)) {
                return contact;
            }
        }
        return null;
    }

    public void editContact(Contact contact, Scanner scanner) {
        System.out.print("Enter new Address: ");
        contact.setAddress(scanner.nextLine());
        System.out.print("Enter new City: ");
        contact.setCity(scanner.nextLine());
        System.out.print("Enter new State: ");
        contact.setState(scanner.nextLine());
        System.out.print("Enter new Zip: ");
        contact.setZip(scanner.nextLine());
        System.out.print("Enter new Phone Number: ");
        contact.setPhoneNumber(scanner.nextLine());
        System.out.print("Enter new Email: ");
        contact.setEmail(scanner.nextLine());
    }

    public void deleteContact(String firstName, String lastName) {
        contacts.removeIf(contact -> contact.getFirstName().equalsIgnoreCase(firstName) && contact.getLastName().equalsIgnoreCase(lastName));
    }
}
