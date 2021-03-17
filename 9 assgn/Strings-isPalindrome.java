import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());//reading input
		while(n--!=0){
			String str = br.readLine();//reading string
			doo(str);
		}
	}

	public static void doo(String s){
		
		if(check(s))
			System.out.println("True");
		else
			System.out.println("False");


	}

	public static boolean check(String s){
		int i=0;
		int j=s.length()-1;


		while(i<j){
			if(s.charAt(i) == s.charAt(j)){
				i++;
				j--;
			}
			else return false;
		}

		return true;
	}

}