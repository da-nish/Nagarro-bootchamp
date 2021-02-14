import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int mid = (n+1)/2;
		for(int i=1; i<=mid; i++){
			print(i, mid);
		}

		if(n%2==0) print(mid, mid);
		for(int i=mid-1; i>0; i--){
			print(i, mid);
		}

	}

	public static void print(int i, int n){

		int s = n-i;

		while(s--!=0) System.out.print("   ");

		int x=i;
		while(x>=1) {
			System.out.print(x--);
			if(x!=0) System.out.print(" ");
		}

		s=i-1;
		while(s--!=0) System.out.print("   ");

		x=1;
		while(x<=i && i!=1) System.out.print(x+++" ");


		System.out.println();

	}

}