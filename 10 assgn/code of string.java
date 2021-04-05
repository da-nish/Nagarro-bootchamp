import java.util.*;
/*
Recursion-Codes of the string
Explaination: 
	Input: 1125
	Output: [aabe, aay, ale, kbe, ky]

*/
import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int code = 1125;

		print(code,"");


	}

	public static char get(int code){
		char c = (char)(96+code);
		return c;
	}

	public static void print(int code, String re){
		if(code<=0) {
			System.out.println(re);
			return;
		}

		if(code%10<27)
			print(code/10, get(code%10)+re);

		if(code>9)
			if(((code/10)%10)*10+(code%10)<27) 
				print((code/10)/10, get(((code/10)%10)*10+(code%10)) +re);

	}
}