import java.util.*;
/**
 * largestelement
 */
public class largestelement {

     public static void main(String[] args) {
        int arr[]={10,28,22,30,14};
        int lar=arr[0],pos=0;
        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i]>lar)
            {
                lar=arr[i];
                pos=i;
            }
        }
        System.out.println(lar + "at pos " + pos);
        

        
    }
        
    
}
    
