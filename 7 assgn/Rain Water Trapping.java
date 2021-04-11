import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ar[] = new int[n];

		for(int i=0; i<n; i++){
			ar[i] = in.nextInt();
		}

		doo(ar, n);

	}

	//rain water tapping
	public static void doo(int ar[], int n) { 
        Stack<Integer> stack = new Stack<>();

		int leftmax = 0;
		for (int i:ar ) {
			leftmax = Math.max(leftmax, i);
			stack.push(leftmax);
		}

		int re=0;
		int rightmax=0;
		for (int i=n-1; i>=0; i-- ) {
			rightmax = Math.max(rightmax, ar[i]);
			re += Math.min(stack.pop(), rightmax) - ar[i];
		}

		System.out.println( re );
        
    }
}