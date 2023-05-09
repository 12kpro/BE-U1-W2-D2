import java.util.HashMap;
import java.util.Map;

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
		String contact = null;
		for (Map.Entry<String, String> entry : addressBook.entrySet()) {
			if (entry.getValue().equals(phone)) {
				contact = entry.getKey();
			}
		}
		if (contact != null) {

			System.out.printf("Name: %s, Phone: %s%n", contact, phone);
		} else {
			System.out.printf("Phone number %s Not found!%n", phone);
		}
//		addressBook.forEach((key, val) -> {
//			
//			if (val.equals(phone)) {
//				contact = key;
//				System.out.printf("Name: %s, Phone: %s%n", key, val);
//			} else {
//				System.out.printf("Phone number %s Not found!%n", phone);
//			}
//		});
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
		addressBook.forEach((key, value) -> System.out.printf("Name: %s, Phone: %s%n", key, value));
	}
}
