import java.util.*;
/*
RECURSION-tower of hanoi
*/

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		String a = "T1";
		String b = "T2";
		String c = "T3";

		print(n, a/*from*/, b/*to*/, c/*using*/);

		System.out.println(ct);

		// boolean b = false;
		// System.out.print("[");
		// for (String st:s ) {
		// 	if(b) System.out.print(", ");
		// 	System.out.print(st);
		// 	b=true;
		// }
		// System.out.print("]");
	}



	static int ct=0;
	public static void print(int n, String a, String b, String c){
		if(n==0){
			// c++;
			return ;
		}

		print(n-1, a, c, b);
		System.out.println("Move "+n +"th disc from "+ a +" to "+b);// transfer disk n from a to b tower
		print(n-1, c, b, a);
        ct++;
	}
}