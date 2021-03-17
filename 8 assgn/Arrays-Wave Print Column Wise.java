import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();

		int ar[][] = new int[n][m];

		for (int i=0; i<n; i++ ) {
		for (int j=0; j<m; j++ ) {
			ar[i][j] = in.nextInt();
		}
		}

		// int ar[][] = {
		// 	{1,2,3,4},
		// 	{1,2,3,4},
		// 	{1,2},
		// 	{1,2,3,4,5},
		// 	{1,2,3},
		// 	{1,2,3,4}
		// };
		// int n=ar.length;
		// int m=ar[0].length;

		doo(ar, n, m);
	}

		

	public static void doo(int ar[][], int n, int m){

		int c=0;
		int i=0;
		int j=0;

		int mx_col = 0;

		for(int t[]:ar) mx_col = Math.max(mx_col, t.length);
		System.out.println(mx_col);

		while(c<mx_col){

			for(i=0; i<n; i++){
				if(j<ar[i].length)
				System.out.print(ar[i][j]+" ");
			}
			j++;
			for(i=n-1; i>=0; i--){
				if(j<ar[i].length)
				System.out.print(ar[i][j]+" ");
			}
			j++;
		
			c++;
		}
	}
}