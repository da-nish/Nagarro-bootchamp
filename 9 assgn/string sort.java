import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]) throws IOException{
		Scanner in = new Scanner(System.in);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt( br.readLine() );
		String ar[] = new String[n];

		for (int i=0; i<n; i++ ) {
			ar[i] = br.readLine();
		}

		doo(ar, n);


	}


	public static void doo(String ar[], int n){

		Arrays.sort(ar, new Comparator<String>() {
    		public int compare(String o1, String o2) {
    			if(o1.startsWith(o2)==true || o2.startsWith(o1)==true) return -1;
        		return o1.compareTo(o2);
    		}
		});

		for (String s: ar ) {			
			System.out.println(s);
		}

	}
}