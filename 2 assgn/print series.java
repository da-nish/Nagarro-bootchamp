
import java.util.*;
/*
https://hack.codingblocks.com/app/contests/2108/201/problem

*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
        int m = in.nextInt();

        int j=1,i=1;
        while(j<=10){
            int v = (3*i)+2;
            if(v%m!=0){
                System.out.println(v);
                j++;
            }
            i++;
        }


	}
}