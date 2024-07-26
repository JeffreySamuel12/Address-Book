import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first name:");
            String firstName = scanner.nextLine();
            System.out.println("Enter last name:");
            String lastName = scanner.nextLine();
            System.out.println("Enter address:");
            String address = scanner.nextLine();
            System.out.println("Enter city:");
            String city = scanner.nextLine();
            System.out.println("Enter state:");
            String state = scanner.nextLine();
            System.out.println("Enter zip:");
            String zip = scanner.nextLine();
            System.out.println("Enter phone number:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Enter email:");
            String email = scanner.nextLine();

            Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
            addressBook.addContact(contact);

            System.out.println("Do you want to add another contact? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        addressBook.displayContacts();
    }
}
