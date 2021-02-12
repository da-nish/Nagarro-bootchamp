import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

		long n = in.nextLong();

		long x = 1;
		long c=0;
		while(n>0){
			long last = n%10;

			if(last>4 && n>9){
				last = last - (9-last);
				last = -last;

                
			}
            else if(last>4 && last!=9 && n<10){
                last = last - (9-last);
				last = -last;
            }
            else{
				last = 0;
			}

			x = (n%10+last) + (x*10);

			n=n/10;
			c++;
		}		

		long re = 0;
		while(c--!=0){

			re = x%10 + (re*10);
			x = x/10;
		}

		System.out.println(re);
        // Your Code Here

        
    }
}
