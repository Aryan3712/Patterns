import java.util.Scanner; 
public class Question15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = (n+1)/2;
        int l = (n-1)/2;
        for(int i=0;i<f;i++){
            int temp=0;
            for(int j=0;j<f-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                if(k<=i)
                System.out.print(k+1);
                else{
                    System.out.print(i-temp);
                    temp++;
                }
            }
            System.out.println();
        }
        for(int i=0;i<l;i++){
            int temp=0;
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(l-i)*2-1;k++){
                if(k<=(l-i-1))
                System.out.print(k+1);
                else{
                    System.out.print((l-i-1)-temp);
                    temp++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}

/*  
10
    1
   121
  12321
 1234321
123454321
 1234321
  12321
   121
    1

*/