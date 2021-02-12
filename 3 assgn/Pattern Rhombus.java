import java.util.*;
/*

Pattern Rhombus

    1
  2 3 2
3 4 5 4 3
  2 3 2
    1

*/
class file{
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        
        int v=0;
      
        for (int i=0; i<n; i++) {
            int j=n;
            int x=i;
            v=i;
            for (j=0; j<n; j++) {
                if(j>=n-i-1) System.out.print(++v+"\t");
                else System.out.print(" ");
            }
            while(x!=0){
                System.out.print(--v+"\t");
                x--;
            }
           
            System.out.println();
        }

        n=n;
        for (int i=0; i<n-1; i++) {
            int x=n-i-2;
            v=n-i-1;
            for (int j=n; j>0; j--) {
                if(j>n-i-1) System.out.print(" ");
                else System.out.print(v+++"\t");
            }
            v--;
            while(x!=0){
                System.out.print(--v+"\t");
                x--;
            }
           
            System.out.println();
        }
    }


}