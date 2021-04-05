import java.util.*;
/*

Maze_path( Count, Print)
Problem description: 
	
	IP: 3 3
	
		[0,0,0]
		[0,0,0]
		[0,0,0] //no need of array, just for the example


00 01 02 03
10 11 12 13
20 21 22 23
30 31 32 33



	print number of ways to reach from top-left to bottom-right

	OP: VVHH VHVH VHHV HVVH HVHV HHVV

*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
        
        int n=  in.nextInt();

        task(n,n, 1, 1, "");

        
        boolean sp = false;
        for (String s: li ) {
        	if(sp) System.out.print(" ");
        	System.out.print(s);
        	sp=true;
        }

        if(li.size()>1)
        	System.out.println("\n"+li.size());
        else
        	System.out.println(li.size());
        li.clear();

	}

	static List<String> li = new ArrayList<>();
	public static void task(int n, int m, int i, int j, String re){

		if (i == n && j==m) {
			li.add(re);
			return ;
		}
		if(i>n) return ;
		if(j>m) return ;

		task(n,m, i+1,j, re+"V");
		task(n,m, i,j+1, re+"H");
		if(i==j||i+j==n+1)
		task(n,m, i+1, j+1, re+"D");
	}
}