package Dp.unboundedknapscak;

import java.util.Arrays;

public class knapreapeted {
        
        private static int max(int i, int j) { 
                return (i > j) ? i : j; 
        } 
        
        // Returns the maximum value with knapsack 
        // of W capacity 
        private static int unboundedKnapsack(int W, int n, 
                                    int[] val, int[] wt) { 
            
            // dp[i] is going to store maximum value 
            // with knapsack capacity i. 
            int dp[] = new int[W + 1]; 
            
            // Fill dp[] using above recursive formula 
            for(int i = 0; i <= W; i++){ 
                for(int j = 0; j < n; j++){ 
                    System.out.println(Arrays.toString(dp)+" "+wt[j]+"-"+i);
                    if(wt[j] <= i){ 
                        dp[i] = max(dp[i], dp[i - wt[j]] + 
                                    val[j]); 
                        System.out.println("--");
                        System.out.println(dp[i]+"=="+dp[i-wt[j]]);      
                    } 
                } 
            } 
            return dp[W]; 
        } 
    
        // Driver program 
        public static void main(String[] args) { 
            int W = 8; 
            int val[] = {10,40,50,70}; 
            int wt[] = {1,3,4,5}; 
            int n = val.length; 
            System.out.println(unboundedKnapsack(W, n, val, wt)); 
        } 
    } 
    // This code is contributed by Aditya Kumar 
    
