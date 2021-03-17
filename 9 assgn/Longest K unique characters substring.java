import java.util.*;
import java.io.*;
public class Main {
   // Driver Code 
    static public void main(String[] args) { 

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());//reading input

        while(t--!=0){

            String s = br.readLine();//reading string
            int k = Integer.parseInt(br.readLine());//reading input
            doo(s, k);
        } 
    } 


    static void doo(String s, int k){
        //s is given string
        //k is given integer

        if(!check(s,k)){
            System.out.print(-1);
            return;
        }


        Set<Character> set = new HashSet<>();
        set.clear();
// aabacbebebe

        int n=s.length();
        int i=0;
        int mx = -1;

        for(i=0; i<n; i++){
            int c=0;
            for (int j=i; j<n; j++) {
                char ch = s.charAt(j);


                if(set.size()<k){
                    set.add(ch);
                }
                else if(set.size()==k && set.contains(ch)){
                    set.add(ch);
                }
                else{
                    j=n;
                    continue;
                }
                c++;
                // System.out.print(ch);
                mx = Math.max(mx, c);
            }
            // System.out.println();

            set.clear();
        }

        System.out.println(mx);


    } 

    public static boolean check(String s, int k){
        if(s.length()<k) return false;

        Set<Character> set = new HashSet<>();

        for(Character c:s.toCharArray()){
            set.add(c);
        }

        if(set.size()<k) return false;
        return true;
    }
    
}