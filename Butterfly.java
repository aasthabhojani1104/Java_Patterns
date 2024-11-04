import java.util.*;
public class Butterfly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int n=sc.nextInt();
        //upper half of the pattern
        for (int i=1;i<=n;i++) {
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces after the pattern
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part of the pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //lower part of the pattern
        for (int i=n;i>=1;i--) {
            //1st part
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces after the pattern
            int spaces=2*(n-i);
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            //2nd part of the pattern
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
