import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();//reading string
		check(str);
		
	}

	

	public static void check(String str){


		for(int i=0;i<str.length();i++){
	        if(i%2==0)
            	System.out.print((char)(str.charAt(i)+1));
        	else
            	System.out.print((char)(str.charAt(i)-1));

		}
	}

}