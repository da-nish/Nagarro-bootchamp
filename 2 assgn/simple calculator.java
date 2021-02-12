import java.util.*;

/*
Link: https://hack.codingblocks.com/app/contests/2108/461/problem
*/

public class Main {
    public static void main(String args[]) {
       Scanner in = new Scanner(System.in);

		char ch,x;
		ch  = in.next().charAt(0);
		//int c=0;
		while(ch!='x' && ch!='X')
		{

		if(ch=='+'||ch== '-'||ch== '*'||ch== '/' ||ch== '%')
		{
			int N1=0,N2=0;
			N1= in.nextInt();
			N2= in.nextInt();
			if(ch=='+') System.out.println(N1+N2);
			
			else if(ch=='-') System.out.println(N1-N2);
			
			else if(ch=='*') System.out.println(N1*N2);

			else if(ch=='/') System.out.println(N1/N2);

			else if(ch=='%') System.out.println(N1%N2);
		}
		else System.out.println("Invalid operation. Try again.");
		
    	ch  = in.next().charAt(0);
	}
    } 


}
