import java.util.*;
/*
Recursion-Codes of the string
Explaination: 
	Input: 1125
	Output: [aabe, aay, ale, kbe, ky]

*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int code = in.nextInt();

		code = rev(code);

		print(code, "");

		// Collections.sort(s);

		boolean b = false;
		System.out.print("[");
		for (String st:s ) {
			if(b) System.out.print(", ");
			System.out.print(st);
			b=true;
		}
		System.out.print("]");
	}



	public static int rev(int code){
		int re = 0;

		while(code>0){
			re=code%10 + (10*re);
			code=code/10;
		}

		return re;
	}

	static List<String> s = new ArrayList<>();
	static char ch[] = {'\0','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

	public static void print(int code, String re){
		if(code<=0){
			// System.out.println(re);
			s.add(re);
			return ;
		}


		if((code/10)%10>0){
			if (code%10 <26) {
				print(code/10, re+ ch[code%10]);
			}
			if ((code%10)*10+((code/10)%10) <26) {
				print((code/10)/10, re+ ch[(code%10)*10+((code/10)%10)]);
			}

		}
		else{
			
			if (code%10 <26) {
				print(code/10, re+ ch[code%10]);
			}
		}
	}
}