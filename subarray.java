import java.io.*;
import java.util.*;
public class subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,count=0;
        n=sc.nextInt();
        int[] arr=new int[n];
        int[] a=new int[n];
        for(i=0;i< n;i++)
        arr[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            for(j=i;j<n;j++)
            {
                int f=0;
                for(k=i;k<=j;k++){
        
                    System.out.print(arr[k]);
                    a[f]=arr[k];
                    f++;
                }
                int mins=a[0];
                for(int l=0;l<f;l++) {
                    if(a[l]<=mins)
                    mins=a[l];
                 }
                    System.out.print("  "+ mins);
                    count=count+mins;

                System.out.println();
                }
            }
            System.out.println(count);

        }
    }

    
