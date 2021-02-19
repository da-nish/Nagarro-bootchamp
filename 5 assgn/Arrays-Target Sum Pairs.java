import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        int target = in.nextInt();
        doo(ar, n, target);

	}


	public static void doo(int ar[], int n, int target){

        for(int i=0; i<n; i++){
            for ( int j=i+1; j<n; j++) {
                if(ar[i]+ar[j]==target) {
                    int min = Math.min(ar[i], ar[j]);
                    int max = Math.max(ar[i], ar[j]);
                    System.out.println(min+" and "+max);
                }
            }
        }

	}

}