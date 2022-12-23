import java.util.*;
public class leftrotatebyone {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]=new int[10];
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];

       
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

        
    }
    
}
