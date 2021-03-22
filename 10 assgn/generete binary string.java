import java.util.*;
import java.io.*;
/*
Generate Binary Strings
Explaination: https://www.geeksforgeeks.org/generate-all-binary-strings-from-given-pattern/
*/
class file {
    	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());


        // int t=in.nextInt();
        while(t--!=0){
		    String b = br.readLine();
		    sp=false;
		    print(0, b, "");
		    System.out.println();
        }
	}


	static boolean sp=false;

	public static void print(int i, String b, String c){
		if(i>=b.length()){
			if(sp) System.out.print(" ");
			System.out.print(c);
			sp=true;
			return ;
		}


		if(b.charAt(i)=='?'){
			print(i+1, b, c+"0");
			print(i+1, b, c+"1");
		}
		else{
			print(i+1,b, c+b.charAt(i));
		}
	}
}