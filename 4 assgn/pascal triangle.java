import java.util.*;
class file {
    public static void main(String args[]) {

        
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();

        int ar[] = {1};
        System.out.println(1);
        for(int i=2; i<=n; i++){
            int t[] = new int[i];
            
            for(int j=0; j<i; j++){
                if(j==0 || j==i-1){
                    System.out.print(1+" ");
                    t[j] = 1;
                }
                else {
                    System.out.print(ar[j] + ar[j-1]+" ");
                    t[j] = ar[j] + ar[j-1];
                }
            }
            ar=t;
            System.out.println();
        }

    }
}