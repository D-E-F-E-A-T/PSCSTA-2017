import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class pandora {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("/media/citrus/Samsung USB/judge data/pandora.in"));
		int num = s.nextInt();
		for(int i = 0; i < num; i++) {
			int start = s.nextInt();
			int end = s.nextInt();
			int games = 0;
			if(start > 1500) {
				if(end % 5 == 0) {
					games = ((end - start) / 4) + 1;
				} else {
					games = ((end - start) / 4);
				}
			} else {
				if(end < 1500) {
					games = 0;
				} else {
				if(end % 5 == 0 && start != 1500) {
				games = ((end - 1500) / 4) + 1;
				} else {
					games = ((end - 1500) / 4);
				}
				}
			}
			System.out.println(games + " Games");
		}
	}
}
