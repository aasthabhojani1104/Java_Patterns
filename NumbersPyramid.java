
import java.util.Scanner;

public class NumbersPyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //numbers->print Row number , Row number times
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();

        }
    }
}
