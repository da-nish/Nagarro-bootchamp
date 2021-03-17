import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		
		doo(s);


	}


	public static void doo(String s){
		int c = (int) s.charAt(0);

		if(c>=65 && c<=90)
			System.out.println("UPPERCASE");
		else if(c>=97 && c<=122)
			System.out.println("lowercase");
		else
			System.out.println("Invalid");
	}
}