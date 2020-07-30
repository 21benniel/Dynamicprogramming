package Dp.Knapscak01;

public class Twoequalsubsetsum {
    public static boolean subset(int arr[],int sum)
    {
        boolean dp[][]=new boolean[arr.length][sum+1];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0 && j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    dp[i][j] = (arr[0] == j ? true : false);
                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else
                {
                    if(j<arr[i])
                    {
                        dp[i][j]=dp[i-1][j];
                    }
                    else
                    {
                        dp[i][j]=dp[i-1][j]||dp[i-1][j-arr[i]];
                    }
                }
                
            }
            
        }
        //  uncomment this code to print table 
        // for (int i = 0; i <arr.length;i++) 
        // { 
        // for (int j = 0; j <=sum; j++) {
        //     System.out.print (dp[i][j]+" "); 
        // }System.out.println();
        // }
        return dp[arr.length-1][sum];

    }
    public static void main(String[] args) {
        int set[] = { 1,2,3,4 }; 
        int sum=0;
        for(int i=0;i<set.length;i++)
        {
            sum+=set[i];
        }
        if(sum%2==1)
        {
            System.out.println("NO");
            return;
        }
        sum=sum/2;
        if(subset(set,sum)==true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }

}