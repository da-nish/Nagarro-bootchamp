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
		int s = n-i;


		while(s--!=0) System.out.print("  ");
		int x = i;
		while(x >= 0) System.out.print(x-- +" ");
		x+=2;
		while(x <= i) System.out.print(x++ +" ");

		System.out.println();
	}
}