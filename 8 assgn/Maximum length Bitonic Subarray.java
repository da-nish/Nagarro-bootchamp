import java.util.*;
import java.io.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int ar[] = new int[n];


		for (int i=0; i<n; i++ ) {
			ar[i] = in.nextInt();
		}


		// for (int i=0; i<n; i++) {		
		// 	ar[i] = in.nextInt();
		// }
		doo(ar, n);
	}

	public static void doo(int a[], int n) {

		int inc[] = new int[n];
		int dec[] = new int[n];

		inc[0]=1;
		dec[n-1]=1;
		for(int i=1;i<n;i++)
		{
			if(a[i-1]<a[i])
			{
				inc[i]=inc[i-1]+1;
			}
			else
			{
				inc[i]=1;
			}
		}

		for(int j=n-2;j>=0;j--)
		{
			if(a[j]>a[j+1])
			{
				dec[j]=dec[j+1]+1;
			}
			else
			{
				dec[j]=1;  
			}
		}
		int maxt=inc[0]+dec[0]-1;
		for(int i=1;i<n;i++)
		{
			if((inc[i]+dec[i]-1)>maxt)
				maxt=inc[i]+dec[i]-1;
		}
		System.out.print(maxt);
    }
}