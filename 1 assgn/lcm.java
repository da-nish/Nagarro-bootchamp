import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int max = Math.max(n,m);
        
        while(true){
            if(max%n==0 && max%m==0) {
                break;
            }
            max++;
        }
        System.out.println(max);
    
    }
}