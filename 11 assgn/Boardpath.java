import java.util.*;
/*
Problem: https://www.hackerrank.com/contests/hourrank-7/challenges/array-splitting/problem
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n=in.nextInt();
		int m=in.nextInt();
	
		doo(n,m,0);

		for(Integer i:li) System.out.print(i+" ");
	
	}


	static List<Integer> li = new ArrayList<>();

	public static void doo(int n, int m, int re){
		if(re==m){
			li.add(re);
		}

		for(int d=1; d<=m && re+d<=n; d++){
			doo(n, m, (re)+d);
		}

	}

}