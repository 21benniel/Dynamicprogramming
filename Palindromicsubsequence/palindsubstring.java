package Dp.Palindromicsubsequence;


public class palindsubstring {
    public static  int  lps(char s[]) {
        char ns[]=new char[s.length*2+1];
        int in=0;
        for(int i=0;i<s.length*2+1;i++)
        {
            if(i%2==1)
            {
                ns[i]=s[in++];
            }
            else
            {
                ns[i]='#';
            }
        }
        // int dp[]=new int[s.length*2+1];
        
        return 1;
    }
    public static void main(String[] args) {
        String str = "forgeeksskeegfor"; 
        System.out.println("Length is: " + lps(str.toCharArray()));
    }
}