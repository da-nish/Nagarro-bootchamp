import java.util.Arrays; 
import java.util.*;
  
class file { 
      
    // function to find maximum number 
    static int maximum(int a, int b, int c) 
    { 
        return Math.max(Math.max(a, b), c); 
    } 
      
    // function to find minimum number 
    static int minimum(int a, int b, int c) 
    { 
        return Math.min(Math.min(a, b), c); 
    } 
      
    // Finds and prints the smallest Difference 
    // Triplet 
    static void smallestDifferenceTriplet(int arr1[], 
                       int arr2[], int arr3[], int n) 
    { 
          
        // sorting all the three arrays 
        Arrays.sort(arr1); 
        Arrays.sort(arr2); 
        Arrays.sort(arr3); 
      
        // To store resultant three numbers 
        int res_min=0, res_max=0, res_mid=0; 
      
        // pointers to arr1, arr2, arr3 
        // respectively 
        int i = 0, j = 0, k = 0; 
      
        // Loop until one array reaches to its end 
        // Find the smallest difference. 
        int diff = 2147483647; 
          
        while (i < n && j < n && k < n) 
        { 
            int sum = arr1[i] + arr2[j] + arr3[k]; 
      
            // maximum number 
            int max = maximum(arr1[i], arr2[j], arr3[k]); 
      
            // Find minimum and increment its index. 
            int min = minimum(arr1[i], arr2[j], arr3[k]); 
            if (min == arr1[i]) 
                i++; 
            else if (min == arr2[j]) 
                j++; 
            else
                k++; 
      
            // comparing new difference with the 
            // previous one and updating accordingly 
            if (diff > (max - min)) 
            { 
                diff = max - min; 
                res_max = max; 
                res_mid = sum - (max + min); 
                res_min = min; 
            } 
        } 
      
        // Print result 
        System.out.print(res_max + ", " + res_mid 
                                 + ", " + res_min); 
    } 
      
    //driver code 
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        
        int ar1[] = new int[n];
        int ar2[] = new int[n];
        int ar3[] = new int[n];
          
        for (int i=0; i<n; i++) 
            ar1[i] = in.nextInt();
        for (int i=0; i<n; i++) 
            ar2[i] = in.nextInt();
        for (int i=0; i<n; i++) 
            ar3[i] = in.nextInt();
          
        smallestDifferenceTriplet(ar1, ar2, ar3, n); 
    } 
} 