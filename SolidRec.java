import java.util.*;
public class SolidRec {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows");
        int n = sc.nextInt();
        System.out.println("Enter the number of Columns");
        int m= sc.nextInt();
        //Row (Outer loop)
        for(int i=1;i<=n;i++){
            //Column (Inner loop)
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    } 
}
