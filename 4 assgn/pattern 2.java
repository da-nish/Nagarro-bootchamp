import java.util.*;
/*
IP:5

1 
1 4 
1 4 9 
1 4 9 16 
1 4 9 16 25 

*/
public class file {
    public static void main (String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1; i<=n; i++){
            print(i);
        }

    }

    public static void print(int i){
        // int s = n-i;
        for(int j=1; j<=i; j++){
             System.out.print(j*j+" ");
        }
        
        System.out.println();
    }
}