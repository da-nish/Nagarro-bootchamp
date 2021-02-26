import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }

        int q = in.nextInt();
        int ar2[][] = new int[q][2];
        for(int i=0; i<q; i++){
            ar2[i][0] =  in.nextInt();
            ar2[i][1] =  in.nextInt();
        }


        doo(ar, ar2, n, q);

	}


	public static void doo(int ar[], int ar2[][], int n, int m){
        for(int i=0; i<m; i++){

            if(que(ar, n, ar2[i][0], ar2[i][1]))
        	   System.out.println("Yes");
            
            else
               System.out.println("No");

        }
	}

    public static boolean que(int p[], int n, int a,int k){

        int cnt=0;
        for(int i=0; i < n ; i++){
            if(a % p[i]==0){
                cnt++;
            }
        }
        if(cnt >= k){
            return true;
        }
        else{
            return false;
        }
    }


}