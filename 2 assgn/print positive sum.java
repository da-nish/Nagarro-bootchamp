import java.util.*;

/*

Print all the numbers before the cumulative sum become negative.

*/

public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = 1;
        int sum = 0;
        while(true){
            t = in.nextInt();
            sum += t;
            if(sum < 0) break;
            System.out.println(t);
        }
    }
}