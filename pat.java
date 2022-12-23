import java.util.*;

public class pat {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,i,j;
        n=scn.nextInt();
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            System.out.print("*      ");
        System.out.println();
        }

    }
}