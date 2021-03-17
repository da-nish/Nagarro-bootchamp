import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		// int t = in.nextInt();


		int n = in.nextInt();
		int m = n;
		int ar[][] = new int[n][m];

		// int ar[][] = {
		// 	{1, 2, 3},
		// 	{4, 5, 6},
		// 	{7, 8, 9}
		// };

		for (int i=0; i<n; i++)
		for (int j=0; j<m; j++)		
		ar[i][j] = in.nextInt();
		

		doo(ar, ar.length, ar[0].length);

	}


	public static void doo(int ar[][], int n, int m){
		
		int ar1[][] = new int[n][m];

		int k = n;
		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++)		
				ar1[n-1 -j][i] = ar[i][j];	
		}



		for (int i=0; i<n; i++){
			for (int j=0; j<m; j++)		
				System.out.print(ar1[i][j]+" ");
			System.out.println();
		}

	}
}