// import java.util.*;
// import java.math.*;
// public class trappingrainwater {
//     static int getwater(int arr[],int n){
//         int res=0;
//         for(int i=1; i<n-1; i++)
//         {
//             int lmax=arr[i];
//             for(int j=0; j<i; j++)
//             lmax=Math.max(lmax, arr[j]);
//             int rmax=arr[i];
//             for(int j=i+1; j<n; j++)
//             rmax=Math.max(rmax, arr[j]);
//             res+=Math.min(lmax, rmax)-arr[i];

//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         int arr[] = {3,0,1,2,5}, n = 5;

//        System.out.println(getwater(arr, n));

        
//     }
    
// }

import java.util.*;
import java.io.*;
import java.lang.*;
class GFG 
{ 
    

    static int getWater(int arr[], int n)
    {
    	int res = 0;

    	int lMax[] = new int[n];
    	int rMax[] = new int[n];

    	lMax[0] = arr[0];
    	for(int i = 1; i < n; i++)
    		lMax[i] = Math.max(arr[i], lMax[i - 1]);


    	rMax[n - 1] = arr[n - 1];
    	for(int i = n - 2; i >= 0; i--)
    		rMax[i] = Math.max(arr[i], rMax[i + 1]);

    	for(int i = 1; i < n - 1; i++)
    		res = res + (Math.min(lMax[i], rMax[i]) - arr[i]);
    	
    	return res;
    }


    public static void main(String args[]) 
    { 
       int arr[] = {5, 0, 6, 2, 3}, n = 5;

      System.out.println( getWater(arr, n));

    } 

}