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
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        for (int i=1; i<=n; i++) {
            print(i,n);
        }
        for (int i=n-1; i>=1; i--) {
            print(i,n);
        }

    }


    public static void print(int i, int n){
        int s = n-i;
        int d_left = i;
        int d_right = i-1;

        while(s-- > 0) System.out.print(" ");
        int x=i-1;
        while(d_left-- > 0) System.out.print(++x);
        while(d_right-- > 0) System.out.print(--x);

        System.out.println();
    }
}