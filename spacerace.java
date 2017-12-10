import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class spacerace {
	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("/media/citrus/Samsung USB/judge data/spacerace.in"));
		int number = s.nextInt();
		String name = "";
		double finalSpeed = 9999999;
		double finalTime = 0;
		String n1 = "";
		int time = 0;
		int dist = 0;
		double speed = 0;
		double newSpeed = 0;
		for(int i = 0; i < number; i++) {
			n1 = s.next();
			time = s.nextInt();
			dist = s.nextInt();
			speed = s.nextDouble();
			newSpeed = dist / speed;
			finalTime = time + newSpeed;
			if(finalTime < finalSpeed) {
				name = n1;
				finalSpeed = finalTime;
			} 
		}
		System.out.println(name + " finished in " + finalSpeed + " seconds");
	}
}
