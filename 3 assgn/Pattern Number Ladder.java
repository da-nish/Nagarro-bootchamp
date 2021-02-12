import java.util.*;


/*

Pattern Number Ladder

1
2 3
4 5 6
7 8 9 10

*/
class file{
	public static void main(String args[]){ 
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
       
        for (int i=0; i<=n; i++){ 
            System.out.println("*   *"); 
            System.out.println("*   *"); 
  
            if(i<n) { 
                System.out.println("*****"); 
            } 
        } 
    
    }
}