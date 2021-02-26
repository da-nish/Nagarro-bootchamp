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
        int pre = ar[0];
        int min = ar[0];
        int sum = ar[0];

        for(int i=1; i<n; i++){
            sum+=ar[i];
            pre = Math.min(ar[i], ar[i]+pre);
        	min = Math.min(min, pre);
        }

        // if(min>0) min=0;
        // System.out.println(min);
        System.out.println(Math.max(sum+Math.abs(min), min) );
	}

}