import java.util.*;
 
public class GFG {
    static int findMinDiff(int arr[], int n,
                                    int m)
    {
      
        if (m == 0 || n == 0)
            return 0;
        Arrays.sort(arr);
      
        if (n < m)
           return -1;

        int min_diff = Integer.MAX_VALUE;
      
        for (int i = 0; i + m - 1 < n; i++)
        {
            int diff = arr[i+m-1] - arr[i];
            if (diff < min_diff)
                min_diff = diff;
        }
        return min_diff;
    }
    
    public static void main(String[] args)
    {
        int arr[] = {7980,22349,999,2799,229900,11101,9999,2195,9800,4999
                   };
                    
        int m = 2;  // Number of Employees
         System.out.println(" The difference between the choosen goodie with highest price and lowest price for "+m +" "+"Employees");
        int n = arr.length;
        System.out.print("Minimum difference is "
                + findMinDiff(arr, n, m));
             
    }
}
