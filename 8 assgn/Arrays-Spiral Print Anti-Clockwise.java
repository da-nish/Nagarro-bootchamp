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

	public static void doo(int ar[][], int n, int m){
	
		// int ar[][] = {
		// 	{1,2,3,4,5,6,7,8},
		// 	{1,2,3,4,5,6,7,8},
		// 	{1,2,3,4,5,6,7,8},
		// 	{1,2,3,4,5,6,7,8},
		// 	{1,2,3,4,5,6,7,8},
		// 	{1,2,3,4,5,6,7,8}
		// };

		int c= 0;
		int top = 0;
		int right = ar[0].length-1;
		int left = 0;
		int down = ar.length-1;

		while(c<ar.length*ar[0].length){

			
			
			for(int i=top; i<down; i++){
				System.out.print(ar[i][left]+", ");
				c++;
			}

			for(int i=left; i<right; i++){
				System.out.print(ar[down][i]+", ");
				c++;
			}

			for(int i=down; i>top; i--){
				System.out.print(ar[i][right]+", ");
				c++;
			}

			for(int i=right; i>left; i--){
				System.out.print(ar[top][i]+", ");
				c++;
			}
			
			down--;
			top++;
			right--;
			left++;
		}
		System.out.print("END");
		

	}
}