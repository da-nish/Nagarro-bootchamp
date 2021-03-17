import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());//reading input
		String[] arr = br.readLine().split(" ");//reading string array

		for (int i=0; i<n; i++) {		
			doo(arr[i], arr[i].length());
		}
	}

	public static void doo(String s, int n) { 
		Stack<Integer> stack = new Stack<>();

		int k=0;
		int dlen=1;
		for(int i=0; i<n; i++){
			if(s.charAt(i)=='I' || s.charAt(i)=='i'){
				stack.push(dlen);
				while(!stack.isEmpty()){
					System.out.print(stack.pop());
				}
				dlen++;
			}
			else{
				stack.push(dlen);
				dlen++;
			}
		}

		stack.push(dlen);
		while(!stack.isEmpty()){
			System.out.print(stack.pop());
		}

		System.out.println();

    }


}