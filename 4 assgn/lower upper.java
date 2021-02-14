import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		char x = in.next().charAt(0);
		int v = (int)x;
		if(v >= 65 && 95>= v) System.out.print("UPPERCASE");

		else if (v >= 97 && 122>= v) System.out.print("lowercase");
		else System.out.print("Invalid");

	}
}