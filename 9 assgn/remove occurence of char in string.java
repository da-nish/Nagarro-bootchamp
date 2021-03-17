import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		String c = in.nextLine();
		
		doo(s, c.charAt(0));


	}


	public static void doo(String s, char ch){

		
		for(int i=0; i<s.length(); i++) {
		
			if(ch!=s.charAt(i)){
				System.out.print(s.charAt(i));
			}

		}		


	}
}