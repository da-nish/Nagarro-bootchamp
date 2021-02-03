import java.util.*;
class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        int gcd = 1;
        for (int i=1; i<n; i++) {
            if(n%i==0 && m%i==0) gcd = i;
        }

        System.out.println(gcd);

    }

}
