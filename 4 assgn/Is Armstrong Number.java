import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		
		int n = in.nextInt();

		int l = len(n);
		if(check(n,l)) System.out.println("true");
		else System.out.println("false");
		
	}

	public static boolean check(int n, int l){

		int sum = 0;
		int n1 = n;
		while(n1>0){
			sum += Math.pow(n1%10, l);
			n1 = n1/10;
		}
		return n==sum;
	}

	public static int len(int n){
		int l=0;
		
		while(n>0){
			l++;
			n=n/10;
		}
		return l;
	}
}