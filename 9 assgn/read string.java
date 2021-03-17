import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		
		doo(s);


	}


	public static void doo(String s){

		for(int i=0; i<s.length(); i++) {

			int c = (int)s.charAt(i); 
			if(c>=65 && c<=90 && i!=0){
				System.out.println();
			}

			System.out.print((char)c);

		}		

	}
}