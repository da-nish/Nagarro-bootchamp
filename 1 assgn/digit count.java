import java.util.*;

// https://hack.codingblocks.com/app/contests/2108/64/problem
class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int c = 0;

        while(n>0){
            if(n%10 == k) c++;
            n = n/10;
        }
        System.out.print(c);

    }
}