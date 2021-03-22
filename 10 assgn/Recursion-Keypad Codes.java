import java.util.*;
/*
Recursion-Keypad Codes
Explaination: https://www.geeksforgeeks.org/find-possible-words-phone-digits/
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		// int code = 234;
		int code = in.nextInt();

		code = rev(code);

		print(code, "");
		System.out.println("\n"+c);

		// Collections.sort(s);

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


	static char ch[][] = {
		{'\0'},
		{'a','b','c'},
		{'d','e','f'}, 
		{'g','h','i'}, 
		{'j','k','l'}, 
		{'m','n','o'}, 
		{'p','q','r','s'}, 
		{'t','u','v'}, 
		{'w','x','y','z'}
	};

	static int c=0;
	public static void print(int code, String re){
		if(code<=0){
			System.out.print(re+" ");
			c++;
			return ;

		}
		for (int i=0; i<ch[code%10].length; i++) {
			print(code/10, re+ch[code%10][i]);
			
		}
	}
}