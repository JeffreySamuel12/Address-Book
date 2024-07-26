public class AddressBookMain {
        public static void main(String[] args) {
            System.out.println("Welcome to Address Book Program");

            AddressBook addressBook = new AddressBook();
            Contact contact = new Contact("Joseph", "Raj", "123 Main St", "San Andreas", "Gujarat", "12345", "123-456-7890", "joseph.raj@example.com");
            addressBook.addContact(contact);

            addressBook.displayContacts();
        }
}

