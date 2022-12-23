// import java.util.*;
// public class leader {
//     public static void main(String[] args) {
//         int arr[] = {1000, 200, 80, 4, };
//         int n=arr.length;
//         for(int i=0; i<n; i++)
//         {
//             int flag=0;
//             for(int j=i+1; j<n; j++)
//             {
//                 if(arr[i]<=arr[j]){
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)
//             System.out.print(arr[i]+" ");
//         }

//     }
    
// }
import java.util.*;
import java.io.*;
import java.lang.*;
class leader
{ 
    

    static void leaders(int arr[], int n)
    {
    	int curr_ldr = arr[n - 1];

    	System.out.print(curr_ldr+" ");

    	for(int i = n - 2; i >= 0; i--)
    	{
    		if(curr_ldr < arr[i])
    		{
    			curr_ldr = arr[i];

    			System.out.print(curr_ldr+" ");
    		}
    	}
    }


    public static void main(String args[]) 
    { 
       int arr[] = {7, 10, 4, 10, 6, 5, 2}, n = 7;

       leaders(arr, n);

    } 

}