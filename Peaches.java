import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Peaches {
	public static void main(String[] args) throws FileNotFoundException {
		String judge = "/media/citrus/Samsung USB/judge data/peaches.in"; // judge’s directory on flash drive
		Scanner s = new Scanner(new File(judge));
		int number = s.nextInt();
		for(int i = 0; i < number; i++) {
		int n = s.nextInt();
		int c = s.nextInt();
		int r = s.nextInt();
		int p = s.nextInt();
		int cost = 0;
		int newC = 0;
		int newR = 0;
		int newP = 0;
		while(n > 0 && c > 0) {
			n--;
			c--;
			newC++;
			cost++;
		}
		while(n > 0 && r > 0) {
			n--;
			r--;
			newR++;
			cost+=2;
		}
		while(n > 0 && p > 0) {
			n--;
			p--;
			newP++;
			cost+= 3;
		}
		System.out.println(newC + " " + newR + " " + newP + " " + "$" + cost);
		}
	}
}
