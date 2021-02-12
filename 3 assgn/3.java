import java.util.*;

/*

Pattern Triangle
      1 
    2 3 2
  3 4 5 4 3
4 5 6 7 6 5 4

*/


class file{
	public static void main(String args[]){

    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
      
      
        for (int i = 1; i <= n; i++) { 
            int t=1;
                for (; t<=n-i; t++ ) {
                    System.out.print("  ");
                }
                int x=0;
                for (; t<=n; t++ ) {
                    System.out.print(i+x+++" ");
                }
                for (t=1; t<=(i-1); t++) {
                    System.out.print(i+ --x -1 +" ");
                }

           
            System.out.println(); 
        } 
        
    } 
}