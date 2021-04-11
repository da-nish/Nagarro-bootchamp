import java.util.*;
/*
Problem: https://www.geeksforgeeks.org/find-maximum-number-possible-by-doing-at-most-k-swaps/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		String b[] = s.split(" ");
		max = b[0];

		int k = Integer.parseInt(b[1]);

		doo(b[0].toCharArray(), max.length(), k);

		System.out.println(max);

	}

	static String max = "";

	public static void swap(char ar[], int i, int j){
		char t = ar[i];
		ar[i] = ar[j];
		ar[j] = t ;
	}

	// form maximum number
	// static String max = set input value
	public static void doo(char ar[]/*int to char[]*/, int n, int k){

		if(k==0) return;

		for (int i=0; i<n; i++) {
			for (int j=i+1; j<n; j++) {
				// System.out.println(c++);
				if(ar[i]<ar[j]){
					swap(ar, i, j);

					if(String.valueOf(ar).compareTo(max)>0)
						max = String.valueOf(ar);

					doo(ar, n, k-1);
					swap(ar, i, j);
				}
			}
		}
	}
	
}