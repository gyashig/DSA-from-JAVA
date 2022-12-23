// import java.util.*;
// public class maxdiffrence {
//     public static void main(String[] args) {
//         int arr[] = {30,10,8,2};
//         int n=arr.length;
//         int min=arr[0];
//         int max=arr[0];
//         for(int i=1;i<n;i++)
//         {
//             if(arr[i]<min)
//             min=arr[i];
//             else if(arr[i]>max)
//             max=arr[i];
//         }
//         System.out.println("diffrence is "+ (max-min));
        
//     }
    
    
// }
import java.util.*;
import java.io.*;
import java.lang.*;
class maxdiffrence 
{ 
    

    static int maxDiff(int arr[], int n)
    {
    	int res = arr[1] - arr[0], minVal = arr[0];

    	for(int i = 1; i < n; i++)
    	{
    		
    			res = Math.max(res, arr[i] - minVal);
    			
    			minVal = Math.min(minVal, arr[i]);
    	}

    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {2, 3, 10, 6, 4, 8, 1}, n = 7;

       System.out.println(maxDiff(arr,n));

    } 

} 


