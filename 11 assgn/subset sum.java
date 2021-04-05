import java.util.*;
/*
subset sum
*/
class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();

		int ar[] = new int[n];
		for (int i=0; i<n; i++) {
			ar[i] = in.nextInt();
		}
		int t = in.nextInt();

		task(ar, 0, "", 0, t);

		for (String s: li) {
			for (int i=0; i<s.length(); i++) {
				System.out.print(s.charAt(i)+" ");
			}
			System.out.print(" ");
		}
		System.out.println();
		System.out.println(li.size());
	}

	static List<String> li = new ArrayList<>();

	public static void task(int ar[], int i,String s, int sum, int t){

		if(i>=ar.length){
			return;
		}
		if(sum+ar[i]==t) {
			li.add(s+ar[i]);
		}

		if(sum>t){
			task(ar, i+1, s, sum, t);
		}
		else{
			task(ar, i+1, s+ar[i],sum+ar[i], t);
			task(ar, i+1, s,sum, t);
		}
	}
}