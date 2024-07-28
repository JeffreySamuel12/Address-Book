import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookMain {
    private static Map<String, AddressBook> addressBookMap = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter Address Book name:");
            String addressBookName = scanner.nextLine();
            AddressBook addressBook = addressBookMap.getOrDefault(addressBookName, new AddressBook());
            addressBookMap.put(addressBookName, addressBook);

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

            System.out.println("Do you want to add another Address Book? (yes/no)");
            String response = scanner.nextLine();
            if (!response.equalsIgnoreCase("yes")) {
                break;
            }
        }

        displayAllAddressBooks();
    }

    private static void displayAllAddressBooks() {
        for (Map.Entry<String, AddressBook> entry : addressBookMap.entrySet()) {
            System.out.println("Address Book: " + entry.getKey());
            entry.getValue().displayContacts();
        }
    }
}
