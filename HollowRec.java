import java.util.*;
public class HollowRec {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of Columns");
        int m= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || j==m || i==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
