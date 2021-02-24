import java.util.Scanner; 
public class Question8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = (n+1)/2;
        int l = (n-1)/2;
        for(int i=0;i<f;i++){
            for(int j=0;j<f-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<l;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(l-i)*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

10
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/