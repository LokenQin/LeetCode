import java.util.Scanner;

public class XiaoHongShu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nArray = new int[n];
        for(int i = 0; i < n; i++){
            nArray[i] = sc.nextInt();
        }
        int[][] dp = new int[n][n];
        int[] countResult = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            dp[n][n] = 0;
        }
        for(int i = 0;i<n;i++){
            if(nArray[i]==1){
                count++;
            }
            countResult[i]=count;
        }
        for(int i = 0; i<n;i++){
            int newCount=0;
            for(int j = i+1;j<n;j++){
                if(nArray[j]==0){
                    newCount++;
                    dp[i][j]=newCount;
                }else{
                    newCount--;
                    dp[i][j]=newCount;
                }
            }
        }
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(max<(countResult[i]+dp[i][j])){
                    max = countResult[i]+dp[i][j];
                }
            }
        }
        return ;
    }

}
