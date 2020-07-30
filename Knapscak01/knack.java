package Dp.Knapscak01;
public class knack {
    public static void print(int dp[][])
    {
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<dp[0].length;j++)
            {
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
    }
    public static int knapSack(int w,int arr[],int val[],int n)
    {
        int dp[][]=new int[n+1][w+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=w;j++)
            {
                if(j==0||i==0)
                {
                    dp[i][j]=0;

                }
                else if(j<arr[i-1])
                {
                    dp[i][j]=dp[i-1][j];//top
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i-1]]+val[i-1]);//max of top or before line +val
                }
            }
        }
        print(dp);
        return dp[n][w];
    }
    public static void main(String[] args) {
        int  val[] = new int[] {60, 100, 120 }; 
        int arr[] = new int[] {  10, 20, 30}; 
        int W = 50; 
        int n = val.length; 
        System.out.println(knapSack(W, arr, val, n)); 
    }
}