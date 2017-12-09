import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class QueenAnne {
	public static void main (String[] args) throws IOException
	{
		String judge = "/media/citrus/Samsung USB/judge data/queenanne.in"; // judge’s directory on flash drive
		BufferedReader br = new BufferedReader(new FileReader(judge));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++)
		{
			String s = br.readLine();
			if (isLit(s)) {
				System.out.println("likes "+ s);
			}
			else
			{
				System.out.println("hates "+ s);
			}
		}
	}
	static boolean isLit(String s)
	{
		char[] sa = s.toCharArray();
		for (int i = 0; i < s.length()-1; i++)
		{
			if (sa[i] == sa[i+1])
			{
				return true;
			}
		}
		return false;
	}
}
