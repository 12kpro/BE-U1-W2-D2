import java.util.HashMap;

public class AddressBook {
	private static HashMap<String, String> addressBook = new HashMap<>();

	static void addContact(String name, String phone) {
		if (addressBook.put(name, phone) != null) {
			System.out.printf("Contact %s number %s added!%n", name, phone);
		}

	}

	static void removeContact(String name) {

		if (addressBook.remove(name) != null) {
			System.out.printf("Contact %s removed!%n", name);
		}
	}

	static void findByPhone(String phone) {

		addressBook.forEach((key, val) -> {
			if (val.equals(phone)) {
				System.out.println(key + " = " + val);
			} else {
				System.out.printf("Phone number %s Not found!%n", phone);
			}
		});

	}

	static void findByName(String name) {
		String number = addressBook.get(name);
		if (number != null) {
			System.out.printf("%s number is %s%n", name, number);
		} else {
			System.out.printf("Contact %s not found!%n", name);
		}

	}

	static void printAddressBook() {
		addressBook.forEach((key, value) -> System.out.println(key + " = " + value));
	}
}
