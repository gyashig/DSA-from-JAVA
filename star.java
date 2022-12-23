import java.util.*;

public class star {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n,i,j,k,p;
        n=scn.nextInt();
        if(n==1)
        System.out.print("*\t");
        else if(n==3)
        {
            System.out.print("*\t");
            System.out.print("\t");
            System.out.print("*\t");
            System.out.println();
            System.out.print("*\t");
            System.out.print("*\t");
            System.out.print("*\t");
            System.out.println();
            System.out.print("*\t");
            System.out.print("\t");
            System.out.print("*\t");
            System.out.println();


        }
        else if(n==7)
        {
            for(i=1;i<=n-4;i++)
           {
              System.out.print("*\t");
              for(j=1;j<=(n-2);j++)
              System.out.print("\t");
              System.out.print("*\t");
              System.out.println();

            }
            p=n-2;
            System.out.print("*\t");
            for(j=1;j<=n-2;j++)
            {
              if(j==(p/2+1))
              System.out.print("*\t");
              else
              System.out.print("\t");
            }
            System.out.print("*\t"); 
            System.out.println(); 
            System.out.print("*\t");
            for(j=1;j<=n-1;j++)
            {
              if(j==p/2-1 )
              System.out.print("*\t");
              else if(j==(n-1))
              System.out.print("*\t");
              else
              System.out.print("\t");
            }
            System.out.print("*\t"); 
            System.out.println(); 
            System.out.print("*\t");
            for(j=1;j<=(n-2);j++)
            System.out.print("\t");
            System.out.print("*\t");
            System.out.println();
            System.out.print("*\t");
              for(j=1;j<=(n-2);j++)
              System.out.print("\t");
              System.out.print("*\t");
              System.out.println();


        }
        else
        {
            for(i=1;i<=n-3;i++)
            {
               System.out.print("*\t");
               for(j=1;j<=(n-2);j++)
               System.out.print("\t");
               System.out.print("*\t");
               System.out.println();

            }
            p=n-2;
            System.out.print("*\t");
            for(j=1;j<=n-2;j++)
            {
              if(j==p/2+1)
              System.out.print("*\t");
              else
              System.out.print("\t");
             }
            System.out.print("*\t"); 
            System.out.println(); 
            System.out.print("*\t");
            for(j=1;j<=n-1;j++)
            {
              if(j==p/2 )
              System.out.print("*\t");
              else if(j==(n-2))
              System.out.print("*");
              else
              System.out.print("\t");
            }
            System.out.print("*\t"); 
            System.out.println(); 
            System.out.print("*\t");
            for(j=1;j<=(n-2);j++)
            System.out.print("\t");
            System.out.print("*\t");
        }


    }
}