import java.util.*;
public class selectionsort   
{
    public static void main(String[] args)
    {
       Scanner sc =new Scanner(System.in);
       int a[];
       a= new int[20];
       int n = sc.nextInt();
       for(int i=0; i<n; i++ )
       a[i]= sc.nextInt();
       for(int i=0; i<n-1; i++)
       {
           int min=1;
           for(int j=i+1; j<n; j++)
           {
               if(a[j]<a[min])
                 min=j;
           }
                  int temp = a[i];
                  a[i] = a[min];
                  a[min] = temp;
        } 
       for( int i=0; i<n; i++)
           System.out.print(" "+a[i]);
    }
}
