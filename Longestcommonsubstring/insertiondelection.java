package Dp.Longestcommonsubstring;

public class insertiondelection {
    public static int editDistDP(String s1,String s2,int n,int m)
    {
        int dp[][]=new int[n+1][m+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0)
                {
                    dp[i][j]=j;
                }
                else if(j==0)
                {
                    dp[i][j]=i;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=dp[i-1][j-1];
                }
                else
                {
                    dp[i][j] = 1 +Math.min( // Insert 
                                       dp[i - 1][j], // Remove 
                                       dp[i][j - 1]);
                }
            }
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        return dp[n][m];
    }
    public static void main(String[] args) {
        String str1 = "heap"; 
        String str2 = "pea"; 
        System.out.println(editDistDP(str1, str2, str1.length(), str2.length())); 
    
    }
}