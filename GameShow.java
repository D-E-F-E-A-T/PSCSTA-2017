import java.io.*;
import java.util.*;

public class GameShow {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner file = new Scanner(new File("/media/citrus/Samsung USB/judge data/gameshow.in"));
		int c = file.nextInt();
		int[] costs = buildArray(file, c);
		int[] rewards = buildArray(file, c);
		int n = file.nextInt();
		for (int i = 0; i < n; i++) {
			int m = file.nextInt();
			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int j = 0; j < c; j++) {
				if (m - costs[j] >= 0 && rewards[j] > costs[j]) {
					m += rewards[j] - costs[j];
					list.add(j);
					for (int k = 0; k < j; k++) {
						if (!list.contains(k) && m - costs[k] >= 0 && rewards[k] > costs[k]) {
							m += rewards[k] - costs[k];
							list.add(k);
						}
					}
				}
			}
			System.out.println(m);
		}

	}
	
	public static int[] buildArray(Scanner file, int c) {
		int[] arr = new int[c];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = file.nextInt();
		}
		return arr;
	}

}
