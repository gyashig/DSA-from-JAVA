// import java.util.*;
// public class frequency {
//     public static void main(String[] args) {
//         int arr[] = {20, 20, 10, 20, 10,  1};
//         int n=arr.length;
//         int count=1;
//         for(int i=0;i<n; i++)
//         {
//             count=1;
//             for(int j=i+1;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 {
//                     count++;
                    
                    

//                 }
                
                
//             }
//             System.out.println(arr[i] + " "+ count);
//         }
//     }
    
// }
import java.util.*;
import java.io.*;
import java.lang.*;
class frequency 
{ 
    

    static void printFreq(int arr[], int n)
    {
    	int freq = 1, i = 1;

    	while(i < n)
    	{
    		while(i < n && arr[i] == arr[i - 1])
    		{
    			freq++;
    			i++;
    		}

    		System.out.println(arr[i - 1] + " " + freq);

    		i++;
    		freq = 1;
    	}
    	if(n==1 || arr[n-1]!=arr[n-2])
    	System.out.println(arr[n-1]+" "+ 1) ;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {10, 10, 20, 30, 30, 30}, n = 6;

       printFreq(arr, n);

    } 

}
