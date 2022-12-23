import java.util.*;
import java.util.stream.*;
public class pbt {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int[] inputArray = sc.nextInt();
        int chunkSize = sc.nextInt();
        
        int[][] output = splitArray(inputArray, chunkSize);
        for (int[] x : output)
            System.out.println(Arrays.toString(x));
    }
    
    public static int[][] splitArray(int[] inputArray, int chunkSize) {
        return IntStream.iterate(0, i -> i + chunkSize)
                .limit((int) Math.ceil((double) inputArray.length / chunkSize))
                .mapToObj(j -> Arrays.copyOfRange(inputArray, j, Math.min(inputArray.length, j + chunkSize)))
                .toArray(int[][]::new);
    }
    
}
