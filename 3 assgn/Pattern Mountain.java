import java.util.*;
/*

Pattern Mountain

1           1
1 2       2 1  
1 2 3   3 2 1
1 2 3 4 3 2 1   

*/
class file{
	public static void main(String args[]) { 
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
      
        for (int i=1; i<=n; i++) {

            for (int j=1; j<=n; j++) {
                if(i>=j) System.out.print(j);
                else System.out.print(" ");
            }
            for (int j=n-1; j>=1; j--) {
                if(i>=j) System.out.print(j);
                else System.out.print(" ");
            }

            System.out.println();
        }

       
    }


}