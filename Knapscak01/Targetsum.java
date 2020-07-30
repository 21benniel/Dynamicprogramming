package Dp.Knapscak01;

public class Targetsum {
    public static int solve(int arr[],int s)
    {
        int dp[][]=new int[arr.length][2001];
        dp[0][arr[0]+1000]=1;
        dp[0][1000-arr[0]]+=1;
        for(int i=1;i<arr.length;i++)
        {
            for(int j=-1000;j<=1000;j++)
            {
                if(dp[i-1][j+1000]>0)
                {
                    dp[i][j+arr[i]+1000]+=dp[i-1][j+1000];
                    dp[i][j-arr[i]+1000]+=dp[i-1][j+1000];
                }
            }
        }
        return (s>1000)?0:dp[arr.length-1][s+1000];
    }
    public static void main(String[] args) {
        int arr[]={1,1,1,1,1};
        int s=3;
        System.out.println(solve(arr,s));
    }
}