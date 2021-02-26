import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        int c=0;
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
            if(ar[i]==0) c++;
        }

        doo(ar, n, c);

	}


	public static void doo(int ar[], int n, int c){
        for(int i=0; i<n; i++){
        	if(c-->0) System.out.print(0+" ");
        	else System.out.print(1+" ");
        }
	}


}