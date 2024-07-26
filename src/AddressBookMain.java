import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        // Adding a sample contact for demonstration
        Contact contact = new Contact("John", "Doe", "123 Main St", "Anytown", "Anystate", "123456", "123-456-7890", "john.doe@example.com");
        addressBook.addContact(contact);

        // Edit contact
        System.out.print("Enter First Name of the contact to edit: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter Last Name of the contact to edit: ");
        String lastName = scanner.nextLine();

        Contact contactToEdit = addressBook.findContactByName(firstName, lastName);
        if (contactToEdit != null) {
            addressBook.editContact(contactToEdit, scanner);
            System.out.println("Contact updated successfully!");
        } else {
            System.out.println("Contact not found.");
        }

        // Delete contact
        System.out.print("Enter First Name of the contact to delete: ");
        String deleteFirstName = scanner.nextLine();
        System.out.print("Enter Last Name of the contact to delete: ");
        String deleteLastName = scanner.nextLine();

        addressBook.deleteContact(deleteFirstName, deleteLastName);
        System.out.println("Contact deleted successfully!");

        addressBook.displayContacts();
    }
}
