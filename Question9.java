import java.util.Scanner; 
public class Question9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}
/* 
10
1
12
123
1234
12345
123456
1234567
12345678
123456789
12345678910

*/