package Dp.Longestcommonsubstring;

public class Stringintervel {
    public static boolean comb(String s1,String s2,String s3)
    {
        boolean dp[][]=new boolean[s2.length()+1][s3.length()+1];
        for(int i=0;i<=s2.length();i++)
        {
            for(int j=0;j<=s3.length();j++)
            {
                int l=i+j-1;
                if(i==0 && j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    if(s1.charAt(l)==s3.charAt(j-1))
                    {
                        dp[i][j]=dp[i][j-1];
                    }
                }
                else if(j==0)
                {
                    if(s1.charAt(l)==s2.charAt(i-1))
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                }
                else
                {
                    
                    dp[i][j]=(s1.charAt(l)==s2.charAt(i-1)?dp[i-1][j]:false)||(s1.charAt(l)==s3.charAt(j-1)?dp[i][j-1]:false);
                }
            }

        }
        for(int i=0;i<=s2.length();i++)
        {
            for(int j=0;j<=s3.length();j++)
            {
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        return true;
    }
    public static void main(String[] args) {
        String s1="aaxaby";
        String s2= "axy";
        String s3= "aab";
        System.out.println(comb(s1,s2,s3));
    }
}