import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException {
		Scanner in = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int n = Integer.parseInt(br.readLine());//reading input
		while(n--!=0){
			String str = br.readLine();//reading string
			check(str);
		}
	}

	

	public static void check(String s){
		Map<Character, Integer> map = new HashMap<>();

		for(Character c: s.toCharArray()){
			map.put(c, map.getOrDefault(c, 0)+1);
		}

		char ch = '\0';
		int mx = 0;
		for (Character c: map.keySet()) {
			
			if(mx<map.get(c)){
				ch = c;
				mx = map.get(c);
			}
		}

		System.out.println(ch);
	}

}