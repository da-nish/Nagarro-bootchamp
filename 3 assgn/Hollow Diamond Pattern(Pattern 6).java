import java.util.*;


/*

Hollow Diamond Pattern(Pattern 6)
IP=5
* * * * *
* *   * *
*       *
* *   * *
* * * * *


*/

class file{
	public static void main(String args[]) 
    { 
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
      
    int s1=1,s2=n-2;
    for(int i=1;i<=n;i++){
        if(i ==1 || i==n)
            for(int j=1;j<=n;j++)
                System.out.print("*\t");
        else{
            if(i<=n/2){
                for(int j=n/2;j>=i-1;j--){
                    System.out.print("*\t");
                }
                for(int j=1;j<=s1;j++)
                    System.out.print(" \t");
                s1+=2;
                for(int j=n/2;j>=i-1;j--){
                    System.out.print("*\t");
                }
            }
            else{
                for(int j=n/2;j<i;j++)
                    System.out.print("*\t");
                for(int j=1;j<=s2;j++)
                    System.out.print(" \t");
                s2-=2;
                for(int j=n/2;j<i;j++)
                    System.out.print("*\t");
            }
        }
        System.out.println();
    }
    
    }
}