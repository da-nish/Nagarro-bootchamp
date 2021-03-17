import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		
		doo(s);


	}


	public static void doo(String s){

		int mx = -1;
		char l = s.charAt(0);
		int c = 1;
		for(int i=1; i<s.length(); i++) {

			if(l==s.charAt(i)){
				c++;
			}else{
				l = s.charAt(i);
				c=1;
			}

			mx = Math.max(mx, c);

		}		


		System.out.println(mx);


	}
}