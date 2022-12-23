// import java.util.*;
// public class leftrotatebyd {
//     public static void main(String[] args) {
//         int arr[]={10,55,29,30,35};
//         int d=2,p=1;
//         int n=arr.length;
//         while(p<=d){
//             int temp=arr[0];

       
//         for(int i=0;i<n-1;i++)
//         {
//             arr[i]=arr[i+1];
//         }
//         arr[n-1]=temp;
//         p++;
//         }
//         for(int i=0;i<n;i++){
//             System.out.print(arr[i]+" ");
//         }

//     }
    
// }
///////////////////this above is naive/// there is another solution//////////////////
import java.util.*;
import java.io.*;
import java.lang.*;
class leftrotatebyd 
{ 
    

    static void leftRotate(int arr[], int d, int n)
    {
    	int temp[] = new int[d];

    	for(int i = 0; i  < d; i++)
    	{
    		temp[i] = arr[i];
    	}

    	for(int i = d; i  < n; i++)
    	{
    		arr[i - d] = arr[i];
    	}

    	for(int i = 0; i  < d; i++)
    	{
    		arr[n - d + i] = temp[i];
    	}	
    }

    public static void main(String args[]) 
    { 
       int arr[] = {1, 2, 3, 4, 5}, n = 5, d = 3;

       System.out.println("Before Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

       System.out.println();

       leftRotate(arr, d, n);

       System.out.println("After Rotation");

       for(int i = 0; i < n; i++)
       {
       		System.out.print(arr[i]+" ");
       }

    } 

}
