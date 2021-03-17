import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();//reading string
		check(str);
		
	}

	

	public static void check(String s){

		int n = s.length();
		char last = s.charAt(0);
		String re = "";

		for (int i=1; i<n; i++) {
			char ch = s.charAt(i);

			if(last == ch){

			}
			else{
				re = re+last;
				last = ch;

			}
			if(i+1==n) re = re+last;
		}
		System.out.println(re);
	}

}