import java.io.*;
import java.util.*;

public class ISBN {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner file = new Scanner(new File("/media/citrus/Samsung USB/judge data/isbn.in"));
		int n = file.nextInt();
		for (int i = 0; i < n; i++) {
			int sum = 0;
			String code = file.next();
			for (int j = 0; j < code.length(); j++) {
				char c = code.charAt(j);
				int digit = Character.getNumericValue(c);
				if (j % 2 == 0) {
					sum += digit;
				} else {
					sum += 3 * digit;
				}
			}
			if (sum % 10 == 0) {
				System.out.println("VALID");
			} else {
				System.out.println("INVALID");
			}
		}

	}

}
