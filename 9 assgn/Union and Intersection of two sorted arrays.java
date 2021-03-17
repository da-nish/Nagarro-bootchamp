import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);



		int n = in.nextInt();
		int ar1[] = new int[n];

		for (int i=0; i<n; i++) 
			ar1[i] = in.nextInt();
		


		int m = in.nextInt();
		int ar2[] = new int[m]; 

		for (int i=0; i<m; i++) 
			ar2[i] = in.nextInt();
		
         

		union(ar1, ar2, ar1.length, ar2.length);
		inter(ar1, ar2, ar1.length, ar2.length);

	}

	public static void union(int []ar1, int []ar2, int n, int m) {
        
        Set<Integer> set = new HashSet<>();

        for(int i: ar1){
        	set.add(i);
        }
        for(int i: ar2){
        	set.add(i);
        }

        //union
        for (int i: set) {
        	System.out.print(i+" ");
        }
        
		System.out.println();
    } 

	public static void inter(int []ar1, int []ar2, int n, int m) {
        
        Set<Integer> set = new HashSet<>();


        for(int i: ar1){
        	set.add(i);
        }
        
        //union
        for (int i: ar2) {
        	if (set.contains(i)) {
        		System.out.print(i+" ");
        	}
        }
        
		System.out.println();
    } 


}