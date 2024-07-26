import java.util.Scanner;
public class AddressBookMain {
        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");

            AddressBook addressBook = new AddressBook();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();
            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();
            System.out.print("Enter Address: ");
            String address = scanner.nextLine();
            System.out.print("Enter City: ");
            String city = scanner.nextLine();
            System.out.print("Enter State: ");
            String state = scanner.nextLine();
            System.out.print("Enter Zip: ");
            String zip = scanner.nextLine();
            System.out.print("Enter Phone Number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();

            Contact contact = new Contact("Joseph", "Raj", "123 Main St", "San Andreas", "Gujarat", "12345", "123-456-7890", "joseph.raj@example.com");
            addressBook.addContact(contact);

            addressBook.displayContacts();
        }
}

