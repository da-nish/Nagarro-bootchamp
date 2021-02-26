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
        Arrays.sort(ar);
        for(int i=0; i<n; i++){
        	System.out.print(ar[i]+" ");
        }
	}


}