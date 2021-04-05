import java.util.*;

/*
problem: https://www.geeksforgeeks.org/number-buildings-facing-sun/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int k = in.nextInt();
		
		int ar[] = new int[n];
		for (int i=0; i<n; i++) {
			ar[i] = in.nextInt();
		}
		doo(ar, n, k);


	}

	public static void doo(int ar[], int n, int k){

		int re = 0;

		for (int i:ar) {

			int ks = i/k;
			if(i%k!=0){
				re++;
			}

			re+=ks;
		}

		System.out.println(re);
	}

}