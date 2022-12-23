import java.io.*;
import java.util.*;
public class revers
{
    public static void main(String[] args) 
    {
        String a[]= new String[100];
        String str="";
        int k=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=" "+s+" ";
        int len=s.length();
        for( int i=0; i<len; i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                a[k]=str+" ";
                k++;
                str="";
            }
            else
            str=str+ch;
        }
        int p=k;
        for(k=p-1; k>0; k--)
        {
            System.out.print(a[k]);
        }
    }
}
