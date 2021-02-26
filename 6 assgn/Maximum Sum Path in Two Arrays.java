import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }

        int m = in.nextInt();
        int ar2[] = new int[m];
        
        for(int i=0; i<m; i++){
            ar2[i] = in.nextInt();
        }

        doo(ar, ar2, n, m);

	}


	public static void doo(int ar[], int ar2[], int n, int m){
        /*
            2 3 7 8 11 12 15 16 20
            1 5 7 9 10 15 30 34
        */

        int lsum = 0;
        int rsum = 0;
        int max = 0;
        int l = 0;
        int r = 0;

        while(l<n && r<m){

            if(ar[l] == ar2[r]){

                max += Math.max(lsum, rsum) + ar[l];
                lsum=0;
                rsum=0;
                l++;
                r++;
            }
            else if(ar[l]<ar2[r]){
                lsum+=ar[l];
                l++;
            }
            else if(ar[l]>ar2[r]){
                rsum+=ar2[r];
                r++;
            }

        }

        while(l<n){
            lsum+=ar[l];
            l++;
        }
        while(r<m){
            rsum+=ar2[r];
            r++;
        }
        max += Math.max(lsum, rsum);

        System.out.println(max);
        
	}


}