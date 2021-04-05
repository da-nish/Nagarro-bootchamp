import java.util.*;
/*
Problem: https://www.hackerrank.com/contests/hourrank-7/challenges/array-splitting/problem
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int t=in.nextInt();
		while(t--!=0){
			int n = in.nextInt();
			int ar[] = new int[n];
	
			for (int i=0; i<n; i++) {
				ar[i] = in.nextInt();
			}

			int sum =0;
			for(int i:ar) sum+=i;
	
			int re = doo(ar, 0, n-1);
	
			System.out.println(re);
		}
	}



	public static int doo(int ar[], int start, int end){

		// if(start<0 || start>ar.length) return 0;
		// if(end<0 || end>ar.length) return 0;
		// if(start>=end) return 0;

		for(int i=start; i<end; i++){
			int lsum = sum(ar, start, i);
			int rsum = sum(ar, i+1, end);

			if(lsum==rsum){

				int left = doo(ar, start, i);
				int right = doo(ar, i+1, end);

				return Math.max(left, right)+1;
			}

		}

		return 0;



	}


	public static int sum(int ar[], int i, int j){
		int s=0;
		for (int t=i; t<=j; t++) {
			s+=ar[t];
		}
		return s;
	}
}