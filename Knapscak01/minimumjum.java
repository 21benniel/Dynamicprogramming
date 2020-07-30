package Dp.Knapscak01;
import java.util.Arrays;
public class minimumjum {
    public static int min(int arr[])
    {
        int n=arr.length;
        int dp[]=new int[n];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(i<=j+arr[j])
                {
                     dp[i]=Math.min(dp[i],dp[j]+1);
                    break;
                }
                
            }
        }
        System.out.println(Arrays.toString(dp));
        return 0;
    }
    public static void main(String[] args) {
        int arr[]={2,3,1,4,2};
        System.out.println(min(arr));
    }
}