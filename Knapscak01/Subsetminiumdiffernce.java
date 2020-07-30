package Dp.Knapscak01;

public class Subsetminiumdiffernce {
    public static int findMin(int arr[],int n,int sum)
    {
        boolean dp[][]=new boolean[n+1][sum+1];
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                if(i==0&&j==0)
                {
                    dp[i][j]=true;
                }
                else if(j==0)
                {
                    dp[i][j]=true;
                }
                else if(i==0)
                {
                    dp[i][j]=false;
                }
                else
                {
                    dp[i][j] = dp[i-1][j]; 
                if (arr[i-1] <= j)
                { 
                    dp[i][j] |= dp[i - 1][j - arr[i-1]]; 
                }
                }
            }
        }
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=sum;j++)
            {
                System.out.print(dp[i][j]+" ");
            }System.out.println();
        }
        int diff = Integer.MAX_VALUE; 
          
        for (int j = sum / 2; j >= 0; j--) 
        { 
            // Find the  
            if (dp[n][j] == true) 
            { 
                diff = sum - 2 * j; 
                break; 
            } 
        } 
        System.out.println(diff);
        return diff; 
    

    }
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 2, 2, 1}; 
        int n = arr.length; 
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        System.out.println ("The minimum difference between 2 sets is "
                            + findMin(arr, n,sum)); 
    }
}