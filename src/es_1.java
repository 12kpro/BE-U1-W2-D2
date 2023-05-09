import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class es_1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n;
		Set<String> words = new HashSet<>();
		Set<String> duplicate = new HashSet<>();

		while (true) {
			try {
				System.out.print("Inserisci il numero di parole da inserire: ");
				n = Math.abs(Integer.parseInt(input.nextLine()));
				for (int i = 0; i < n; i++) {
					System.out.print("Inserisci la parola " + (i + 1) + ": ");
					String word = input.nextLine();
					if (!words.add(word)) {
						duplicate.add(word);
					}
				}
				input.close();
				System.out.println("Numero di parole distinte: " + words.size());
				System.out.println("Elenco delle parole distinte: " + words);
				System.out.println("Elenco delle parole duplicate: " + duplicate);
				break;

			} catch (NumberFormatException e) {
				System.out.println("Devi inserire un numero intero positivo!!");
			}
		}
	}

}
