import java.util.*;

/*
Link: https://hack.codingblocks.com/app/contests/2108/696/problem
*/
public class Main {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

		int n = in.nextInt();

        while(n--!=0){
            int a = in.nextInt();
            int h = in.nextInt();

            int as = 0;
            for(int i=1; as<=a; i++){
                if(i%2!=0 ) as += i;
            }
            int hs = 0;
            for(int i=1; hs<=h; i++){
                if(i%2==0 ) hs += i;
            }

            if(as>=hs) System.out.println("Aayush");
            else System.out.println("Harshit");
        }
    }
}