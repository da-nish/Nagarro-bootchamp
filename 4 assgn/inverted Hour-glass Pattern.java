import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();


		for (int i=n; i>=0; i--) {
			print(i,n);
		}

		for (int i=1; i<=n; i++) {
			print(i,n);
		}

	}


	public static void print(int i, int n){
		int s = i-1;

		int x = n;
		while(x >= i && x!=0) System.out.print(x-- +" ");
		while(s-- > 0) System.out.print("  ");
		s=0;
		while(s++ != i) System.out.print("  ");

		x=i;
		while(x <= n) System.out.print(x++ +" ");

		System.out.println();
	}
}