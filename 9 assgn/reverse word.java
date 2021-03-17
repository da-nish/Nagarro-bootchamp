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
		String []word = s.split(" ");

		for (int i=word.length-1; i>=0; i--) {
			System.out.print(word[i]+" ");
		}
		System.out.println();
	}



}