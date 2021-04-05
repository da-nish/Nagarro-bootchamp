import java.util.*;
/*

Maze_path( Count, Print)
Problem description: https://www.geeksforgeeks.org/count-number-ways-reach-destination-maze/

*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int ar[][] = {{0,  0, 0, 0},
                      {0, -1, 0, 0},
                      {-1, 0, 0, 0},
                      {0,  0, 0, -1}};

        int n= ar.length;
        int m= ar[0].length;

        int r = task(ar, 0, 0);

        System.out.println(r);

	}

	static int re = 0;


	public static int task(int ar[][], int i, int j){

		if (i == ar.length-1 && j==ar[0].length-1 && ar[i][j]==0) {
			return 1;
		}
		if(i>=ar.length) return 0;
		if(j>=ar[0].length) return 0;


		if(ar[i][j]==0){
			return task(ar, i+1,j)+task(ar, i,j+1);
		}
		else return 0;
	}
}