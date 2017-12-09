import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class Treasure {
	
		 public static void main(String[] args) throws NumberFormatException, IOException {
			/**
			Scanner s = new Scanner(new File("treasure.in"));
			System.out.println("YES");
			int number = s.nextInt();
			for(int i = 0; i < number; i++) {
				String num = "";
				num += s.nextInt();
				if(num.length() == 6) {
				if((num.charAt(0) == num.charAt(2)) && (num.charAt(1) % 2 == 0) && ((num.charAt(3) + num.charAt(4) + num.charAt(5)) % 7 == 0)) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
				}
			}
			*/
			 String judge = "/media/citrus/Samsung USB/judge data/treasure.in"; // judge’s directory on flash drive
			 BufferedReader br = new BufferedReader(new FileReader(judge));
			// StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(br.readLine());
			for (int i = 0; i < n; i++)
			{
				if (isGood(br.readLine())){
					System.out.println("YES");
				}else {
					System.out.println("NO");
				}
				
			}
		 }
		static boolean isGood(String num)
		{
			char[] s = num.toCharArray();
			int[] arr = new int[num.length()];
			for (int i = 0; i < arr.length; i++)
			{
				char a = num.charAt(i);
				String seee = a + "";
				arr[i] = Integer.parseInt(seee);
			}
			//System.out.println(Arrays.toString(s));
			//for (int i = 0; i < s.length; i++)
			//{
				// System.out.print(s[i] + " ");
			// }
			//System.out.println(s[1] % 2 == 0);
			//if (num.length() == 6 && (s[0] == s[2]) && (s[1] % 2 == 0) && (((s[3] + s[4] + s[5]) % 7) == 0))
			//{
			//	return true;
			//}
			boolean thing = false;
			if (num.length() == 6)
			{
				if (arr[0] == arr[2])
				{
					if(arr[1] % 2== 0)
					{
						//System.out.println((arr[3] + arr[4] + arr[5]) % 7);
						if((arr[3] + arr[4] + arr[5]) % 7 == 0)
						{
							return true;
						}
						else
						{
							return false;
						}
					}
					else
					{
						return false;
					}
				}
				else
				{
					return false;
				}
			}
			//	return false;
			// return false;
			return thing;
		}
		

}
