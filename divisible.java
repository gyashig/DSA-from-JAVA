import java.io.*;
import java.util.*;
import java.lang.Math;

public class divisible 
{
    public static void main(String[] args) throws IOException 
    {
      int N,i,q;
      int c=0;
      Scanner sc=new Scanner(System.in);
      N=sc.nextInt();
      int a[]=new int[N];
      for(i=0;i<N;i++)
      {
        a[i]=sc.nextInt();
      }
      long sum=0;
      for(i=0;i<N/2;i++)
      {
        int digits =(int)Math.log10(a[i]);
        int r = (int)(a[i] / Math.pow(10,digits));
        sum=sum*10+r;
        
      }
      for(i=N/2;i<N;i++) 
      {
         int k=a[i]%10;
         sum=sum*10+k;
      }
      System.out.println(sum);
      if(sum%11==0)
      System.out.println("OUI");
      else
      System.out.println("NON");
    }
}