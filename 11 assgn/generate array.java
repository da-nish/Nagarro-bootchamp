import java.util.*;
/*
Problem: https://www.geeksforgeeks.org/generate-all-possible-sorted-arrays-from-alternate-elements-of-two-given-arrays/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		
		int a[] = new int[n];
		int b[] = new int[m];

		for (int i=0; i<n; i++) a[i] = in.nextInt();
		for (int i=0; i<m; i++) b[i] = in.nextInt();

		for (int i=0; i<a.length; i++)	doo(a, b, i, 0, true, "");
		
	}

	// generate sorted array from A to B array
	public static void doo(int a[], int b[], int i, int j, boolean br, String re){
		if(i>a.length) return;
		if(j>b.length) return;

		if(!br){
			System.out.println(re);
		}

		if(br)
			for(int t=j; t<b.length; t++){
				if(b[t]>a[i])
					doo(a,b,i+1,t, false, re+a[i]+" "+b[t]+" ");
			}
		else 
			for(int t=i; t<a.length; t++){
				if(b[j]<a[t])
					doo(a,b,t,j+1, true, re);
			}

	}


}	