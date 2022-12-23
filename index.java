import java.io.*;
import java.util.*;

public class index{

public static void main(String[] args) throws Exception {
    Scanner sc= new Scanner(System.in);
    int n,i,s,pos=0,reg=0;
    n=sc.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    s=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if(a[i]==s)
        {
            pos=i;
            break;
        }
        else
        pos=-1;
        
    }
    if(pos != -1)
    System.out.println(pos);
    else
    System.out.println("-1");
    for(i=0;i<n;i++)
    {
        if(a[i]>s)
        {
            reg=i;
            break;
        }
        
    }
    if(reg != -1)
    System.out.println(reg-1);
    else
    System.out.println("-1");

 }

}