import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class phonespell {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("phone.in"));

		int num = 0;
		while(!s.hasNextInt()) {
			s.next();
		}
		num = s.nextInt();
		String str = "";
		if(num == 2) {
			str += "abc";
		} else if(num == 3) {
			str += "def";
		} else if(num == 4) {
			str += "ghi";
		} else if(num == 5) {
			str += "jkl";
		} else if(num == 6 ) {
			str += "mnop";
		} else if(num == 7) {
			str += "qrs";
		} else if(num == 8) {
			str += "tuv";
			 
		} else if(num == 9) {
			str += "wxyz";
		}
		
		int counter = 0;
		while(s.hasNext()) {
			counter = 0;
			String string = s.next();
			for(int i = 0; i < str.length(); i++) {
				if(string.length() >= i) {
				if(string.charAt(i) == str.charAt(i)) {
					counter++;
				}
				}
			}
			System.out.println(counter);
		}

		
		
	}
}
