import java.util.Scanner; 
public class Question12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(j+1);
            }
            System.out.println();
        }
        sc.close();
    }
}

/*
10
12345678910
123456789
12345678
1234567
123456
12345
1234
123
12
1

*/