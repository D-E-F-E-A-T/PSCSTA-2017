import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Fezr
{
	public static void main (String[] args) throws IOException
	{
		String judge = "/media/citrus/Samsung USB/judge data/fezr.in"; // judge’s directory on flash drive
		BufferedReader br = new BufferedReader(new FileReader(judge));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++)
		{
			int sub = Integer.parseInt(br.readLine());
			boolean[] closet = new boolean[5001];
			for(int j = 0; j < sub; j++)
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				int start = Integer.parseInt(st.nextToken());
				int end = Integer.parseInt(st.nextToken());
				for (int yiff = start; yiff <= end; yiff++)
				{
					closet[yiff] = true;
				}
			}
			// System.out.println(maxI + " " + minI);
			int hats = 0;
			for (int count = 0; count < closet.length; count++)
			{
				if (closet[count])
				{
					hats++;
				}
			}
			System.out.println(hats);
		}
	}
}
