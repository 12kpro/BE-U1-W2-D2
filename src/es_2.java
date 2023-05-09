import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class es_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n;
		while (true) {
			try {
				System.out.print("Inserisci un numero intero positivo per definire la lunghezza della lista: ");
				n = Math.abs(Integer.parseInt(input.nextLine()));
				input.close();

				List<Integer> numberList = randomListNumber(n);
				System.out.println("Lista casuale: " + numberList);
				List<Integer> reversedList = reverse(numberList);
				System.out.println("Lista invertita: " + reversedList);
				printEvenOrOdd(numberList, true);
				break;

			} catch (NumberFormatException e) {
				System.out.println("Devi inserire un numero intero positivo!!");
			}
		}
	}

	public static List<Integer> randomListNumber(int n) {
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add((int) (Math.random() * 101));
		}
		Collections.sort(list);
		return list;
	}

	public static List<Integer> reverse(List<Integer> list) {
		List<Integer> reversedList = new ArrayList<>(list);
		Collections.reverse(reversedList);
		return reversedList;
	}

	public static void printEvenOrOdd(List<Integer> list, boolean isEven) {
		System.out.printf("I numeri in posizione %s sono: ", isEven ? "Pari" : "Dispari");
		for (int i = isEven ? 0 : 1; i < list.size(); i += 2) {
			System.out.print(list.get(i) + " ");
		}
	}
}
