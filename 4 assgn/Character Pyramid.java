import java.util.*;
/*

IP: 6

a 
b d 
a c e 
b d f h 
a c e g i 
b d f h j l



*/

class file {
    public static void main (String args[]) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();


        for(int i=0; i<n; i++){
            char a = 'a';
            char b = 'b';

            for(int j=0; j<=i; j++){

                if(i%2==0){
                    System.out.print(a+" ");
                    a = (char)(a+2);
                }
                else{
                    System.out.print(b+" ");
                    b = (char)(b+2);
                }
                
            }System.out.println();
        }

    }
}