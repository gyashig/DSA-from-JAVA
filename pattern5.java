import java. util.*;
public class pattern5 
{
   public static void main(String[] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1; i<=n; i++)
    {
       if(i<=2)
       {
           for(int j=1; j<=i; j++)
           System.out.print("*");
       }
       else if(i>2 && i<n)
       {
         System.out.print("*");
         for(int j=1; j<=i-2; j++)
         System.out.print(" ");
         System.out.print("*");
       }
       else
       {
        for(int j=1; j<=i; j++)
        System.out.print("*");
       }
    System.out.println();
    }
}
}


