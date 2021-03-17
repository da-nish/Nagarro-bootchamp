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
		doo(ar, n, m);
	}

		// int ar[][] = {
		// 	{1,2,3,4},
		// 	{1,2,3,4},
		// 	{1,2},
		// 	{1,2,3,4},
		// 	{1,2,3},
		// 	{1,2,3,4}
		// };

	public static void doo(int ar[][], int n, int m){

		for (int row=0; row<n; row++) {

			if(row%2==0){
				for(int i=0; i<ar[row].length; i++)
					System.out.print(ar[row][i]+", ");
			}
			else{
				for(int i=ar[row].length-1; i>=0; i--)
					System.out.print(ar[row][i]+", ");
			}
		}
					System.out.print("END");
		

	}
}