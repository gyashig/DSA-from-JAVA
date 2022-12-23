import java.util.*;
public class increasesortedarray {
    public static void main(String[] args) {
        int i;
        int flag=0;
        int arr[]={10,55,29,30,35};
        for(i=0; i<arr.length-1; i++){
        
        
            if(arr[i]>arr[i+1]){
            flag=1;
            break;
            }}
        if(flag==0)
        System.out.println("Yes");
        else
        System.out.println("No");

    }
    
}
