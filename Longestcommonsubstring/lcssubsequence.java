package Dp.Longestcommonsubstring;

public class lcssubsequence {
    public static int LCSubStr(char s1[],char s2[],int m,int n)
    {
        int dp[][]=new int[m+1][n+1];
        
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
        String X = "OldSite:GeeksforGeeks.org"; 
        String Y = "NewSite:GeeksQuiz.com"; 
  
        int m = X.length(); 
        int n = Y.length(); 
  
        System.out.println("Length of Longest Common Substring is "
                + LCSubStr(X.toCharArray(), Y.toCharArray(), m, n)); 
    
    }
}