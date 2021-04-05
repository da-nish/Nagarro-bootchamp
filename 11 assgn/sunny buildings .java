import java.util.*;

/*
problem: https://www.geeksforgeeks.org/number-buildings-facing-sun/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int t = in.nextInt();
		
		while(t--!=0){
			int n = in.nextInt();
			int ar[] = new int[n];
			for (int i=0; i<n; i++) {
				ar[i] = in.nextInt();
			}
			doo(ar, n);
		}



	}

	public static void doo(int ar[], int n){

		int re = 0;
		int max = Integer.MIN_VALUE;

		for (int i:ar) {
			if(max<=i){
				re++;
				max = i;
			}
		}

		System.out.println(re);
	}

}