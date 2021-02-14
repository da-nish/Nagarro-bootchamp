import java.util.*;

class file{
  public static void main(String args[]){
		Scanner in = new Scanner(System.in);

		int i,j,n;
    n = in.nextInt();
    System.out.println("1");

    if(n!=1){
      for(i=1;i<n;i++){
        System.out.print(i);
        for(j=1;j<i;j++) System.out.print("0");
          System.out.println(i);
      }
    }
	}
}