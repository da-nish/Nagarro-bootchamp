import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);	

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		int t = Integer.parseInt(br.readLine());//reading input
		
        while(t--!=0){

			String s1 = br.readLine();//reading string
			String s2 = br.readLine();//reading string
		
		    doo(s1,s2);
        }


	}


	public static void doo(String str1, String str2){

		int count1[] = new int[26]; 
		int count2[] = new int[26]; 

		// count frequency of each character 
		// in first string 
		for (int i = 0; i < str1.length() ; i++) 
			count1[str1.charAt(i) -'a']++; 
	
		// count frequency of each character 
		// in second string 
		for (int i = 0; i < str2.length() ; i++) 
			count2[str2.charAt(i) -'a']++; 

		// traverse count arrays to find 
		// number of characters to be removed 
		int result = 0; 
		for (int i = 0; i < 26; i++) 
			result += Math.abs(count1[i] - 
							count2[i]); 
		System.out.println(result); 

	}

}