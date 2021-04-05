import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		String s = in.nextLine();

		doo(s);

	}

	public static void doo(String s){

		String re= "";
		String t = s;
		while(s.length()>0){
			if (check(s)){
				break;
			}
			else{
				re+=s.charAt(s.length()-1);
				s = s.substring(0,s.length()-1);
			}
		}

		System.out.println(re+t);

	}


	public static boolean check(String s){
		int i = 0;
		int j = s.length()-1;

		while(i<j){
			if(s.charAt(i)!=s.charAt(j))
				return false;

			i++;
			j--;
		}

		return true;
	}

}