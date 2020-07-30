package Dp.unboundedknapscak;

import java.util.Arrays;

public class coinchange {
    public static int countWays(int S[],int m,int n)
    {
        int table[]=new int[n+1]; 
  
        // Base case (If given value is 0) 
        table[0] = 1; 
        // Pick all coins one by one and update the table[] values 
        // after the index greater than or equal to the value of the 
        // picked coin 
        for(int i=0; i<m; i++) 
        {
        for(int j=S[i]; j<=n; j++) 
        {
            table[j] += table[j-S[i]]; 
            System.out.println(Arrays.toString(table));
        }
    }
    
        return table[n]; 
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3}; 
        int m = arr.length; 
        int n = 5; 
        System.out.println(countWays(arr, m, n)); 
    }
}