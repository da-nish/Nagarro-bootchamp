import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		for (int i=n; i>0; i--) {
			for (int j=i-1; j>0; j--) {
				System.out.print(" ");
			}
			for (int j=n; j>0; j--) {
				if(j==1 || j==n || i==n || i==1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}

	}
}