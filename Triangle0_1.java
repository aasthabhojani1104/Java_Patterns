import java.util.Scanner;

public class Triangle0_1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n=sc.nextInt();
        for (int i=1; i<=n; i++){
            for (int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){//Even
                    System.out.print("1"+" ");
                }
                else{//Odd
                    System.out.print("0"+" ");
            }
        }
            System.out.println();
        }
    }
}

