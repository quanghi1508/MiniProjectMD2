import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final List<Contact> contacts = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        while (true){
            System.out.println("==========================================");
            System.out.println("|1. Add new contact                      |");
            System.out.println("|2. Edit contact information             |");
            System.out.println("|3. Delete contact information           |");
            System.out.println("|4. Display contact list                 | ");
            System.out.println("|5. Search for contacts by contact code  | ");
            System.out.println("|6. Exit                                 |");
            System.out.println("==========================================");
            System.out.print("Choose a option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    addNewContact();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    showContact();
                    break;
                case 5:

                    break;
                case 6:
                    System.out.println("Thank you for using the program!!!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid selection. Please select again!");
            }
        }
    }

    private static void showContact() {
        if(contacts.isEmpty()){
            System.out.println("No contacts");
        }else{
            System.out.println("Contact: ");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    private static void addNewContact(){
        System.out.println("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();

        System.out.println(" Enter email: ");
        String email = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        Contact newContact = new Contact(id, name, phone, email, address);
        contacts.add(newContact);
        System.out.println("The contact has been added successfully!");
    }




}
