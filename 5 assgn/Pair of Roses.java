import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int t = in.nextInt();
        while(t--!=0){
	        int n = in.nextInt();
	        int ar[] = new int[n];
	        
	        for(int i=0; i<n; i++){
	            ar[i] = in.nextInt();
	        }
	        int target = in.nextInt();
	        doo(ar, n, target);
	    }
	}


	public static void doo(int ar[], int n, int target){

		int l = 0;
		int r = Integer.MAX_VALUE;

		for (int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++){
				if(ar[i]+ar[j]==target){
					if(Math.abs(ar[i]-ar[j])< Math.abs(l-r) ){
						l = Math.min(ar[i], ar[j]);
						r = Math.max(ar[i], ar[j]);
					}

				}
			}
		}

		System.out.println("Deepak should buy roses whose prices are "+l+" and "+r+".");
	}

}