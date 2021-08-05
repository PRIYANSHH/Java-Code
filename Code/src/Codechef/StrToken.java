package Codechef; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.util.Scanner; 
import java.util.StringTokenizer; 

public class StrToken 
{ 
	static class FastReader 
	{ 
		BufferedReader br; 
		StringTokenizer st; 

		public FastReader() 
		{ 
			br = new BufferedReader(new
					InputStreamReader(System.in)); 
		} 

		String next() 
		{ 
			while (st == null || !st.hasMoreElements()) 
			{ 
				try
				{ 
					st = new StringTokenizer(br.readLine()); 
				} 
				catch (IOException e) 
				{ 
					e.printStackTrace(); 
				} 
			} 
			return st.nextToken(); 
		} 

		int nextInt() 
		{ 
			return Integer.parseInt(next()); 
		} 

		long nextLong() 
		{ 
			return Long.parseLong(next()); 
		} 

		double nextDouble() 
		{ 
			return Double.parseDouble(next()); 
		} 

		String nextLine() 
		{ 
			String str = ""; 
			try
			{ 
				str = br.readLine(); 
			} 
			catch (IOException e) 
			{ 
				e.printStackTrace(); 
			} 
			return str; 
		} 
	} 
	public static void main(String[] args) throws IOException {
		FastReader sc=new FastReader();
		int test = sc.nextInt();
		while (test-- > 0) {
			int i, flag = 0, c1 = 0, c2 = 0;
			String s = sc.nextLine();
			StringTokenizer sb = new StringTokenizer(s);
			int len = sb.countTokens();
			String a[] = new String[len];
			for (i = 0; i < len; i++) {
				a[i] = sb.nextToken();
			}
			for (i = 0; i < len; i++) {
				if (a[i].equalsIgnoreCase("berhampore"))
					c1++;
				if (a[i].equalsIgnoreCase("serampore"))
					c2++;
			}
			if (c1 > 0 && c2 > 0)
				System.out.println("Both");
			else if (c1 > 0 && c2 == 0)
				System.out.println("GCETTB");
			else if (c2 > 0 && c1 == 0)
				System.out.println("GCETTS");
			else if (c1 == 0 && c2 == 0)
				System.out.println("Others");

		}
	}

}
