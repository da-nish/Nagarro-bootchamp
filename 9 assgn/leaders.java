import java.util.*;

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
		int last = Integer.MIN_VALUE;
		String re = "";


		for (int i=n-1; i>=0; i--) {
		
			if(ar[i]>last){
				System.out.print(ar[i]+" ");
			}

			last = Math.max(last, ar[i]);	

		}


		System.out.println(re);

	}
}