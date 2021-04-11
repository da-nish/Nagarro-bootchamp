import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        long ar[] = new long[n];

        for(int i=0; i<n; i++){
            ar[i] = in.nextLong();
        }

        int m = in.nextInt();
        int ar2[] = new int[m];

        
        for(int i=0; i<m; i++){
            ar2[i] = in.nextInt();
        }

        doo(ar, ar2, n, m);

	}


	public static void doo(long ar[], int ar2[], int n, int m){

		long temp[] = new long[n];
		for(int i=0; i<n; i++) temp[i] = ar[i];

        for(int i=0; i<m; i++){

			for(int j=0; j<n; j++){
				int x = (n - ((ar2[i])%n) + j)%n;
				temp[j] = ar[x] + temp[j];
			}
        	ar = temp;
        }

        long sum = 0;
        for(int i=0; i<n; i++) sum += ar[i];

        System.out.println(Arrays.toString(ar));
        System.out.println(sum);
        System.out.println(sum%1000000007);
	}


}