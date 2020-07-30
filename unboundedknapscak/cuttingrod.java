package Dp.unboundedknapscak;

public class cuttingrod {
    public static void main(String[] args) {
        int p[]={2,5,7,8};
        int d[]={1,2,3,4};
        int l=5;
        int dp[][]=new int[p.length][l+1];
        
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<=l;j++)
            {
                if(j==0||i==0)
                {
                    dp[i][j]=0;

                }
                else if(j<d[i-1])
                {
                    dp[i][j]=dp[i-1][j];//top
                }
                else
                {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-d[i-1]]+p[i-1]);//max of top or before line +val
                }
            }
        }
        for(int i=0;i<p.length;i++)
        {
            for(int j=0;j<=l;j++)
            {
                    System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}