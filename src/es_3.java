import java.util.Arrays;
import java.util.Scanner;

public class es_3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String options[] = { "0 To quit", "1 Add contact", "2 Remove contact", "3 Find Number by name",
				"4 Find name by number", "5 Print Address Book" };
		choice: while (true) {
			try {
				System.out.println("Select one of the following option: ");
				System.out.println(Arrays.asList(options));
				int option = Math.abs(Integer.parseInt(input.nextLine()));
				switch (option) {
				case 0:
					input.close();
					break choice;
				case 1:
					System.out.print("Input name:");
					String name = input.nextLine();
					System.out.print("Input phone number:");
					String number = input.nextLine();
					AddressBook.addContact(name, number);
					break;
				case 2:
					System.out.print("Input the name of the contact to remove:");
					String removeName = input.nextLine();
					AddressBook.removeContact(removeName);
					break;
				case 3:
					System.out.print("Input the name of the contact to find:");
					String findName = input.nextLine();
					AddressBook.findByName(findName);
					break;
				case 4:
					System.out.print("Input the phone number of the contact to find:");
					String findPhone = input.nextLine();
					AddressBook.findByPhone(findPhone);
					break;
				case 5:
					AddressBook.printAddressBook();
					break;
				default:
					System.out.println("Entered option " + option + " is not valid!");
					break;
				}
			} catch (NumberFormatException e) {
				System.out.println("Devi inserire un numero intero positivo!!");
			}
		}
	}

}
