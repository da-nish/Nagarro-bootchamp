import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException {
		// Scanner in = new Scanner(System.in);
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// int n = in.nextInt();
		// int m = in.nextInt();
		// int ar[][] = new int[n][m];

		// for(int i=0; i<n; i++){
		// 	for (int j=0; j<m; j++) {
		// 		ar[i][j] = in.nextInt();
		// 	}
		// }		

		int ar[][] = {
			{1,2,3,4},
			{5,6,7,8},
			{9,10,11,12},
			{13,14,15,16},
		};

		check(ar, ar.length, ar[0].length);
		
	}

	public static void check(int ar[][], int n, int m){
		int c = 0;

		List<List<Integer>> li = new ArrayList<>();


		for (int j=0; j<m; j++) {
			List<Integer> t = new ArrayList<>();
			int k=j;
			int i=0;

			while(k>=0 && i<n){
				t.add(ar[i][k]);
				// System.out.print(ar[i][k]+" ");
				k--;
				i++;
			}
			li.add(t);
		}

		for (int i=1; i<n; i++) {
			List<Integer> t = new ArrayList<>();
			int k=i;
			int j=m-1;

			while(k<n && j>=0){
				t.add(ar[k][j]);
				// System.out.print(ar[i][k]+" ");
				k++;
				j--;
			}
			li.add(t);
		}

		int i=0;

		for (List<Integer> l: li ) {
			if(i%2==0)
				for (int x=0; x<l.size(); x++) {
					System.out.print(l.get(x)+" ");
				}

			else
				for (int x=l.size()-1; x>=0; x--) {
					System.out.print(l.get(x)+" ");
				}
		
			i++;
		}

	}

// ---------


}