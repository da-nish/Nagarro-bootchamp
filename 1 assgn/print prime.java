import java.util.*;
class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i=0; i<n; i++) {
            if(pp(i)) System.out.println(i);
        }

    }

    public static boolean pp(int n) {
        if (n==2) {
            return true;
        }
        if (n < 2 || n % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(n); 
        for (int i=3; i<=limit; i+=2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
