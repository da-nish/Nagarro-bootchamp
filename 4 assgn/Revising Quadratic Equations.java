import java.util.*;

class file{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);


	    int a = in.nextInt();
	    int b = in.nextInt();
	    int c = in.nextInt();

	    int d=(b*b-4*a*c);

	    if(d>0) {
	       int x=(int)(-b+Math.sqrt(d))/2*a;
	       int y=(int)(-b-Math.sqrt(d))/2*a;
	        System.out.println("Real and Distinct");
	        System.out.print(y+" "+x);    
	    }
	    else if(d==0) {
	        int x=(-b)/2*a;
	        System.out.println("Real and Equal");
	        System.out.print(x+" "+x);    

	    }
	    else  System.out.println("Imaginary");
		

	}
}

   
    


