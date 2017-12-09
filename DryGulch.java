import java.io.*;
import java.util.*;

public class DryGulch {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner file = new Scanner(new File("/media/citrus/Samsung USB/judge data/drygulch.in"));
		int n = file.nextInt();
		for (int i = 0; i < n; i++) {
			int u = file.nextInt();
			int weeks = 10000 / u;
			System.out.println("The water supply will last " + weeks + " weeks at " + u + " gallons per week.");
		}

	}

}
