import java.*;
public class secondlargest {
    public static void main(String[] args) {
        int arr[]={10,28,29,30,14};
        int t=1;
        int lar=arr[0],pos=0;
        while(t<=2){
        arr[pos]=0;  lar=arr[0];pos=0;
        for(int i=0; i<arr.length ; i++)
        {

            if(arr[i]>lar)
            {
                lar=arr[i];
                pos=i;
            }
        }
        
        t++;
    }

        System.out.println(lar + "at pos " + pos);
    }
    
}
