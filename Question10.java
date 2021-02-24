import java.util.Scanner; 
public class Question10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<n-i;k++){
                System.out.print(n-i-k);
            }
            System.out.println();
        }
        sc.close();
    }
}

/* 

9
987654321
 87654321
  7654321
   654321
    54321
     4321
      321
       21
        1
 */