// import java.util.*;
// public class maxsubarraysum {
//     public static void main(String[] args) {
//         int arr[] = {1, -2, 3, -1, 2};
//         int n=arr.length,res=arr[0];
//         for(int i=0;i<n;i++){
//             int count=0;
//             for(int j=i;j<n;j++)
//             {
//                 count+=arr[j];
//             }
//             res=Math.max(res, count);
//         }
//         System.out.println(res);
    
// }
// }
import java.util.*;
public class maxsubarraysum {
    public static void main(String[] args) {
        int arr[] = {1, -2, 3, -1, 2};
        int n=arr.length,res=arr[0], maxend=arr[0];
        for(int i=0;i<n;i++){
            maxend=Math.max(maxend+arr[i],arr[i] );
            res=Math.max(res, maxend);
        }
        System.out.println(res);
    }
}
