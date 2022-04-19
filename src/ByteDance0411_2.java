import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-11
 * @ClassName: ByteDance0411_2
 * @Description: TODO
 */
public class ByteDance0411_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String m = scanner.nextLine();
        int t = scanner.nextInt();
        int[][]dp = new int[s.length()+1][m.length()+1];
        int[]i = new int[t];
        int[]j = new int[t];
        if(s.charAt(0)==m.charAt(0)){
            dp[1][1]=1;
        }else{
            dp[1][1]=2;
        }
        for(int n=0;n<t;n++){
            i[n]=scanner.nextInt();
            j[n]=scanner.nextInt();
        }
        for(int p = 2;p<=m.length();p++){
            if(!s.substring(0,1).contains(""+m.charAt(p-1))&&!m.substring(0,p-1).contains(""+m.charAt(p-1))){
                dp[1][p]=dp[1][p-1]+1;
            }else{
                dp[1][p]=dp[1][p-1];
            }
        }
        for(int q = 2;q<=s.length();q++){
            if(!m.substring(0,1).contains(""+s.charAt(q-1))&&!s.substring(0,q-1).contains(""+s.charAt(q-1))){
                dp[q][1]=dp[q-1][1]+1;
            }else{
                dp[q][1]=dp[q-1][1];
            }
        }
        for(int q=2;q<=s.length();q++){
            for (int p=2;p<=m.length();p++){
                if((!s.substring(0,q).contains(""+m.charAt(p-1))&&!m.substring(0,p-1).contains(""+m.charAt(p-1)))&&(!m.substring(0,p).contains(""+s.charAt(q-1))&&!s.substring(0,q-1).contains(""+s.charAt(q-1)))){
                    dp[q][p]=(dp[q-1][p]>=dp[q][p-1])?dp[q-1][p]+1:dp[q][p-1]+1;
                }else{
                    dp[q][p]=(dp[q-1][p]>=dp[q][p-1])?dp[q-1][p]:dp[q][p-1];
                }
            }
        }
        for(int n=0;n<t;n++){
            System.out.println(dp[i[n]][j[n]]);
        }
        /*for(int n=1;n<=s.length();n++){
            for(int x=1;x<=m.length();x++){
                System.out.print(dp[n][x]+" ");
            }
            System.out.println(" ");
        }*/
    }
}
