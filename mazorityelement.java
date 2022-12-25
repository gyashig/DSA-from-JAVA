// import java.util.*;
// public class mazorityelement {
//     public static void main(String[] args) {
//         int arr[] = {8,7,1,2,4 };
//         int n=arr.length;
//         int found=0,pos=0;
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=0;j<n;j++)
//             {
//                 if(arr[i]==arr[j])
//                 count++;
//             }
//             if(count>n/2)
//             {
//                 found=1;
//                 pos=i;
//             }
            
           
//         }
//         if(found==1)
//         System.out.println(pos);
//         else
//         System.out.println(-1);

//     }
    
// }
///////////////efficient/////////////////////////////
import java.util.*;
import java.io.*;
import java.lang.*;
class majorityelement
{ 

    static int findMajority(int arr[], int n)
    {
    	int res = 0, count = 1;

    	for(int i = 1; i < n; i++)
    	{
    		if(arr[res] == arr[i])
    			count++;
    		else 
    			count --;

    		if(count == 0)
    		{
    			res = i; count = 1;
    		}
    	}

    	count = 0;

    	for(int i = 0; i < n; i++)
    		if(arr[res] == arr[i])
    			count++;

    	if(count <= n /2)
    		res = -1;

    	return res; 
    }


    public static void main(String args[]) 
    { 
       int arr[] = {8, 8, 6, 6, 6, 4, 6}, n = 7;

       System.out.println(findMajority(arr, n));

    } 

}