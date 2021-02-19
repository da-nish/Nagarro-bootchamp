import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }
        int val = in.nextInt();
        doo(ar, n,val);

	}


	public static void doo(int ar[], int n){
        System.out.println(bs(ar, 0, n-1, val));

	}


    public static int bs(int ar[], int l, int r, int val){
        int mid = (l+r)/2;

        if(val>ar[mid])
            return bs(ar, mid+1, r, val);
        else if(val<ar[mid])
            return bs(ar, l, mid-1, val);
        else
            return mid;
    }

}