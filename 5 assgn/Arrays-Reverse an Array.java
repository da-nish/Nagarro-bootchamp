import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        doo(ar, n);

	}

	public static void doo(int ar[], int n){

		for(int i=0; i<(n+1)/2; i++){
			int t = ar[i];
			ar[i] = ar[n-i-1];
			ar[n-i-1] = t;
		}
		for(int i: ar) 
        	System.out.print(i);
	}
}