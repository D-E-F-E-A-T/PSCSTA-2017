import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Practice
{
	public static void main (String[] args) throws IOException
	{
		String judge = "/media/citrus/Samsung USB/JudgeData/goteam.in"; // judge’s directory on flash drive
		BufferedReader br = new BufferedReader(new FileReader("goteam.in"));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++)
		{
			System.out.println("Go " + br.readLine() + "!");
		}
	}
}
class Vertex{int x;int y;public Vertex(int x,int y){this.x=x;this.y=y;}}