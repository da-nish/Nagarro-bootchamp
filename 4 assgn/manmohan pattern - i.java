import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int i,j,n;
     	n = in.nextInt();

		for(i=1;i<=n;i++) {
        	if(i%2==1){
            	for(j=1;j<=i;j++) 
               		System.out.print("1");
        	}
                    
			else {
            	System.out.print("1");

            	for(j=1;j<=i-2;j++)
                    System.out.print("0");
               	System.out.print("1");
          	}
        
        	System.out.println();
     }

	}
}