package Dp.Palindromicsubsequence;

public class palinsubsequence {
    public  int lps(char[] str){
        int T[][] = new int[str.length][str.length];
        for(int i=0; i < str.length; i++){
            T[i][i] = 1;
        }
        for(int l = 2; l <= str.length; l++){
            for(int i = 0; i <=str.length-l ; i++){
                int j = i + l - 1;
                // if(l == 2 && str[i] == str[j]){
                //     T[i][j] = 2;
                 if(str[i] == str[j]){
                    T[i][j] = T[i + 1][j-1] + 2;
                }else{
                    T[i][j] = Math.max(T[i + 1][j], T[i][j - 1]);
                }
            }
        }
        for(int i=0;i<str.length;i++)
        {
            for(int j=0;j<str.length;j++)
            {
                System.out.print(T[i][j]+" ");
            }System.out.println();
        }
        return T[0][str.length-1];
    }
    public static void main(String[] args) {
        String seq = "agbdba"; 
        // int n = seq.length(); 
        palinsubsequence p= new palinsubsequence();
        System.out.println("The lnegth of the lps is "+ p.lps(seq.toCharArray()));
    }
}