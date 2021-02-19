import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        long ar[] = new long[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextLong();
        }
        long target = in.nextLong();
        doo(ar, n, target);

	}


	public static void doo(long ar[], long n, long target){

		for (int i=0; i<n; i++) {
			if(target==ar[i]){
				System.out.println(i);
				return ;
			}
		}


		System.out.println(-1);

	}

}