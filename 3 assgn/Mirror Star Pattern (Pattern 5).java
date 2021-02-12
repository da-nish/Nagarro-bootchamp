import java.util.*;
/*

Mirror Star Pattern (Pattern 5)

      *
   *  *  *  
*  *  *  *  *  
   *  *  *
      *

*/
class file{
	public static void main(String args[]) { 
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
      
        for (int i=1; i<=n; i++,i++) {
            print(i, n);
        }

        for (int i=n-1; i>0; i--) {
            if(i%2!=0) print(i, n);
        }
    }


    public static void print(int i,int n){

        int x = n-i;

        while(x--!=0) System.out.print(" ");
        while(i--!=0) System.out.print("*\t");
        System.out.println();
        
    }
}