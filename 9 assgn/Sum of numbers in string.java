import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());//reading input

		while(t--!=0){
			String s = br.readLine();//reading string
			doo(s, s.length());
		}

	}

	public static void doo(String s, int n){
		int re = 0;
		int l = 0;

		for(int i=0; i<n; i++){
			int x = (int) s.charAt(i);
			if(x>=48 && x<=57) {
				l = l*10 + (x-48);
			}
			else{
				re+= l; 
				l = 0;
			}
		}
		re+= l;
		System.out.println(re);

	}
}