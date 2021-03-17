import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ar[] = new int[n];

		for (int i=0; i<n; i++) {
			ar[i] = in.nextInt();
		}

		check(ar, n);
		
	}

	public static void check(int ar[], int n){
		Vector<String> arr;
        arr = new Vector<>();
 
 		for(int i: ar){
 			arr.add(i+"");
 		}

        printLargest(arr);
	}

	static void printLargest(Vector<String> arr){
 
        Collections.sort(arr, new Comparator<String>()
        {
            // A comparison function which is used by
            // sort() in printLargest()
            @Override public int compare(String X, String Y)
            {
 
                // first append Y at the end of X
                String XY = X + Y;
 
                // then append X at the end of Y
                String YX = Y + X;
 
                // Now see which of the two
                // formed numbers
                // is greater
                return XY.compareTo(YX) > 0 ? -1 : 1;
            }
        });
 
        Iterator it = arr.iterator();
 
        while (it.hasNext())
            System.out.print(it.next());
    }



}