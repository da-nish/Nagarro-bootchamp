import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();

		check(str);
		
	}

	public static void check(String s){
		
		int n = s.length();
		String re = "";
		char last = s.charAt(0);
		for (int i=1; i<n; i++){

			int d =  - s.charAt(i-1) + s.charAt(i);

			re = re+last+d;
			last = s.charAt(i);
		}

		re+=last;

		System.out.println(re);
	}


}