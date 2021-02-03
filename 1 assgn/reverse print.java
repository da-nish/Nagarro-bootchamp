import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        while(n>0){
            int x = n%10;
            System.out.print(x);
            n = n/10;
        }

    }
}
