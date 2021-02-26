import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

        int t = in.nextInt();
        // int t = 1;
        while(t--!=0){

            int c1 = in.nextInt();
            int c2 = in.nextInt();
            int c3 = in.nextInt();
            int c4 = in.nextInt();

            int n = in.nextInt();
            int m = in.nextInt();

            int ar[] = new int[n];            
            for(int i=0; i<n; i++){
                ar[i] = in.nextInt();
            }

            int ar2[] = new int[m];
            for(int i=0; i<m; i++){
                ar2[i] = in.nextInt();
            }

            doo(ar, ar2, n, m, c1, c2, c3, c4);
        }
	}


	public static void doo(int ar[], int ar2[], int n, int m, int c1, int c2, int c3, int c4){

        //rickshaw 
        int Rmin = 0;
        for (int i:ar) {
            Rmin += Math.min(i*c1,c2);
        }
        Rmin = Math.min(Rmin, c3);
        

        //cab
        int Cmin = 0;
        for (int i:ar2) {
            Cmin += Math.min(i*c1,c2);
        }
        Cmin = Math.min(Cmin, c3);
        int result = Math.min(c4, Rmin+Cmin);

        System.out.println(result);
        
	}


}