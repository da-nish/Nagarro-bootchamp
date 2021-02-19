import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


        int n = in.nextInt();
        int ar[] = new int[n];
        
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }

        int target = in.nextInt();
        doo(ar, n, target);

	}

    public static void doo(int arr[], int n, int data){

        int sum=0;  
        Arrays.sort(arr);

        for (int i=0;i<n;i++){
            int left=i+1,right=n-1 ;
            while(left<right){
                sum=arr[i]+arr[left]+arr[right];

                if (sum==data){
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    left++;
                    right--;
                }
                
                if (sum>data){
                    right--;
                }
                if (sum<data){
                    left++;
                }
            }
        }
    }

}