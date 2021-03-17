import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


			int n = in.nextInt();
			int ar[] = new int[n];
			int ar1[] = new int[n];

			for (int i=0; i<n; i++) {
				ar[i] = in.nextInt();
			}
			for (int i=0; i<n; i++) {
				ar1[i] = in.nextInt();
			}
			doo(ar, ar1, n);
	}


	public static void doo(int ar[], int ar1[], int n){
		
// 1 2 3 1 2 4 1
// 2 1 3 1 5 2 2


		Arrays.sort(ar);

		Map<Integer, Integer> map = new HashMap<>();

		for (int i:ar1) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}


		for (int i=0; i<n; i++) {
			if(map.containsKey(ar[i]) && map.get(ar[i])>0){
				System.out.print(ar[i]+" ");
				map.put(ar[i], map.get(ar[i])-1);
			}
		}




		// for (int i=n-1; i>=0; i--) {

		// }


		// System.out.println(re);

	}
}