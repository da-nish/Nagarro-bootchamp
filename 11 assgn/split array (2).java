import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ar[] = new int[n];
		for (int i=0; i<n; i++) {
			ar[i] = in.nextInt();
		}

		Arrays.sort(ar);

		// int ar[] = {1,2,3,4};
		// int n = ar.length;
		boolean fl = false;
		split(ar, 0, 0, 0, "", "");
		System.out.println(li.size());
		for (String s:li ) {
			if(fl) System.out.print(", ");
			System.out.print("\n"+s);

			fl=true;
		}

	}

	static List<String> li = new ArrayList<>();
	public static void split(int ar[], int i, int lsum, int rsum, String lre,String rre){
		if(i>ar.length) return;
		if (i==ar.length){
			if(lsum==rsum){
				li.add(lre +"and"+rre);
			}
			return;
		}
		
		split(ar, i+1, lsum+ar[i], rsum, lre+ar[i]+" ", rre);
		split(ar, i+1, lsum, rsum+ar[i], lre, rre+" "+ar[i]);

	}

	
}