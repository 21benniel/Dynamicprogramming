package Dp.Longestcommonsubstring;

public class sortestcommonsub {
    public static int shortestSuperSequence(String s1,String s2)
    {
        int l=lcs(s1.toCharArray(),s2.toCharArray(),s1.length(),s2.length());
        return s1.length()+s2.length()-l;
    }
    public static int lcs(char s1[],char s2[],int m,int n)
    {
        int dp[][]=new int[m+1][n+1];
        // int res=0;
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                }
                else if(s1[i-1]==s2[j-1])
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else
                {
                    dp[i][j]=Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        return dp[m][n];
    }
    public static void main(String[] args) {
        String X = "AGGTAB"; 
    String Y = "GXTXAYB"; 
      
    System.out.println("Length of the shortest " + 
                             "supersequence is " + 
                      shortestSuperSequence(X, Y)); 
    }
}