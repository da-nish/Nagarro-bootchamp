import java.util.*;
import java.io.*;


class file{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String a = br.readLine();
		String b = new StringBuilder(a).reverse().toString();
		// reversing second string 


		int n = a.length();
		int dp[][] = new int[n][n];

		//filling diagonal
		//1-char palindrome
		for (int i=0; i<n; i++) {
			dp[i][n-i-1] = 1;
		}


		//filling diagonal
		//2-char palindrome
		for (int i=1; i<n; i++) {
			if(b.charAt(i)==a.charAt(n-i) && dp[i][n-i-1]==1)
				dp[i][n-i] = 1;
		}



		int k=0;//it will help us to get 3rd element after diagonal
		for (int i=2; i<n; i++) {//i=2, skip 2 rows because 3rd element will not be present
			for(int j=n-k-1; j<n; j++){
				if(b.charAt(i)==a.charAt(j) && dp[i-1][j-1] == 1)
					//IMP, second string(reversed) is i and first string's all chars will compare and change
					dp[i][j] = 1;
			}
			k++;//increase after each row
		}

		int re = count(dp);
		System.out.println(re);
		//count all 1's inside the dp[][] to get the result

	}

	public static int count(int dp[][]){
		int n = dp.length;
		int re=0;
		for(int i=0; i<n; i++){
			for (int j=0; j<n; j++) {
				// System.out.print(dp[i][j]+" ");
				re=re+dp[i][j];
			}
			// System.out.println();
		}

		return re;
	}
}
