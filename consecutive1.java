import java.util.*;
public class consecutive1 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 1, 1, 1};
        int n=arr.length,res=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i;j<n;j++)
            {
                if(arr[j]==1)
                count++;
                else 
                break;
            }
            res=Math.max(res, count);
        }
        System.out.println(res);
    }
    
}
