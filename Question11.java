import java.util.Scanner; 
public class Question11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print(i+1-k);
            }
            System.out.println();
        }
        sc.close();
    }
}
/*  
10
         1
        21
       321
      4321
     54321
    654321
   7654321
  87654321
 987654321
10987654321

*/