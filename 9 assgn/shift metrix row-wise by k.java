import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		// int t = in.nextInt();


		// int n = in.nextInt();
		// int m = n;
		// int ar[][] = new int[n][m];

		int ar[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};

		// for (int i=0; i<n; i++)
		// for (int j=0; j<m; j++)		
		// ar[i][j] = in.nextInt();
		

		shift(ar, ar.length, 2);

	}

	public static void shift(int [][]mat, int N, int k) {
        if (k > N) { 
            System.out.print("Shifting is not possible"); 
            return; 
        } 
           
        int j = 0; 
        while (j < N) { 
               
            // Print elements from index k 
            for (int i = k; i < N; i++) 
                System.out.print(mat[j][i] + " "); 
                   
            // Print elements before index k 
            for (int i = 0; i < k; i++) 
                System.out.print(mat[j][i] + " "); 
                   
            System.out.println(); 
            j++; 
        } 
    } 


}