import java.util.*;
/*
IP:4

* * * * 
 * * *
  * *
   *

*/
class file{
	public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=n; i>0; i--){
            print(i,n);
        }

    }


    public static void print(int i,int n){
        int s = n-i;

        while(s--!=0) System.out.print(" ");
        while(i--!=0) System.out.print("* ");
        
        System.out.println();
    }
}