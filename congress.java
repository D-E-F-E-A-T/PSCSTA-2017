import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class congress
{
	public static void main (String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("/media/citrus/Samsung USB/judge data/congress.in"));
		// StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++)
		{
			int sub = Integer.parseInt(br.readLine());
			double[] minTemps = new double[sub];
			double[] maxTemps = new double[sub];
			double[] minBright = new double[sub];
			double[] maxBright = new double[sub];
			
			for(int j = 0; j < sub; j++)
			{
				StringTokenizer st = new StringTokenizer(br.readLine());
				minTemps[j] = Double.parseDouble(st.nextToken());
				maxTemps[j] = Double.parseDouble(st.nextToken());
				minBright[j] = Double.parseDouble(st.nextToken());
				maxBright[j] = Double.parseDouble(st.nextToken());
			}
			double max1 = getMax(minTemps);
			double min1 = getMin(maxTemps);
			double max2 = getMax(minBright);
			double min2 = getMin(maxBright);
			if (isFail(min1, min2, max1, max2))
			{
				System.out.println("FAILURE");
			}
			else
			{
				System.out.println(max1 + " " + min1 + " " + max2 + " " + min2);
			}
		}
	}
	static double getMax(double[] arr)
	{
		double max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			max = Math.max(max, arr[i]);
		}
		return max;
	}
	static double getMin(double[] arr)
	{
		double min= Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			min = Math.min(min, arr[i]);
		}
		return min;
	}
	static boolean isFail(double min1, double min2, double max1, double max2)
	{
		if (max1 > min1)
		{
			return true;
		}
		if (max2 > min2)
		{
			return true;
		}
		return false;
	}
}
