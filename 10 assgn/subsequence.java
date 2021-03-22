import java.util.*;
/*
Recursion-Subsequences
Explaination: https://www.geeksforgeeks.org/generating-all-possible-subsequences-using-recursion/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String code = in.nextLine();

		// code = rev(code);

		print(code, 0, "");
		System.out.println("\n"+c);

		// boolean b = false;
		// System.out.print("[");
		// for (String st:s ) {
		// 	if(b) System.out.print(", ");
		// 	System.out.print(st);
		// 	b=true;
		// }
		// System.out.print("]");
	}



	public static int rev(int code){
		int re = 0;

		while(code>0){
			re=code%10 + (10*re);
			code=code/10;
		}

		return re;
	}
	static int c=0;
	public static void print(String str, int i, String re){
		if(i>=str.length()){
			if(re.length()>0)
			System.out.print(" "+re);
			c++;
			return ;
		}

		print(str, i+1, re);
		print(str, i+1, re+ str.charAt(i));

	}
}