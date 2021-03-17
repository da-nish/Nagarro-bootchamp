import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		doo(s);
	}


	public static void doo(String s){

		Set<Character> set = new HashSet<>();
		set.add('a');
		set.add('u');
		set.add('o');
		set.add('i');
		set.add('e');

		int mx = -1;
		int c = 0;
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);


			if(set.contains(ch)){
				c++;
			}else{
				c = 0;	
			}

			mx = Math.max(mx, c);

		}		


		System.out.println(mx);


	}
}