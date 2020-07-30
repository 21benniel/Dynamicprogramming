package Dp.Longestcommonsubstring;

import java.util.Arrays;

public class longestincreasingsub {
    public static int lis(int arr[],int n)
    {
        int dp[]=new int[n+1];
        Arrays.fill(dp, 1);
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && dp[i]<=dp[j]+1)
                {
                    dp[i]=dp[j]+1;
                }
            }
        }
        Arrays.sort(dp);
        return dp[n];
    }
    public static void main(String[] args) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 }; 
            int n = arr.length; 
            System.out.println("Length of lis is " 
                              + lis( arr, n ) + "\n" );
    }
}