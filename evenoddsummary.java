import java.util.*;
public class evenoddsummary {
    public static void main(String[] args) {
        int res=1;
        int arr[] = {5,10,20,6,3,8 };
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            int count=1;
            for(int j=1+1;j<n;j++)
            {
                if((arr[i]%2==0 && arr[j]%2!=0 ) || (arr[i]%2!=0 && arr[j]%2==0 ))
                count++;
                else 
                break;

            }
            res=Math.max(res,count);

        }
        System.out.println(res);
        }
    }
    

