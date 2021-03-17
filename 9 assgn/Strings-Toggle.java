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
		char str[] = s.toCharArray();

		for (int i = 0; i < str.length; i++){
        	if (str[i] >= 'A' && str[i] <= 'Z')
       	    	str[i] = (char) (str[i] + 'a' - 'A');
        	else if (str[i] >= 'a' && str[i] <= 'z')
            	str[i] = (char) (str[i] + 'A' - 'a');

            System.out.print(str[i]);
    	}
	}

}