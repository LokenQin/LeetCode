/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-20
 * @ClassName: LeetCode354
 * @Description: TODO
 */
public class LeetCode354 {
    public static void main(String[] args) {
        int[][] test ={{15,2},{12,1},{5,6},{4,5},{3,4},{2,3},{1,2}};
        Solution354 solution354 = new Solution354();
        int i = solution354.maxEnvelopes(test);
        System.out.println(i);
    }
}
class Solution354 {
    public int maxEnvelopes(int[][] envelopes) {
        int n=envelopes.length;                 //信封数量
        int[] dp = new int[n];
        int max=0,min=0;
        for (int i=0;i<n;i++) {
            //找出最大信封下标
            if ((envelopes[max][0]<envelopes[i][0])&&(envelopes[max][1]<envelopes[i][1])) {
                max=i;
            }
            //找出最小信封下标
            if ((envelopes[min][0]>envelopes[i][0])&&(envelopes[min][1]>envelopes[i][1])) {
                min=i;
            }
        }
        //初始化dp数组，表示每个信封都放入最大信封里
        for (int i=0;i<n;i++) {
            dp[i]=i;
        }
        for (int i=0;i<n;i++) {
            for (int j=i;j<n;j++) {
                if(i==j){
                    continue;
                }
                //计算两个信封的大小 如果第i个信封小于第j个，且i的外层信封大于j，则i的外层信封更改为j
                if (((envelopes[i][0]<envelopes[j][0])&&(envelopes[i][1]<envelopes[j][1]))&&((envelopes[dp[i]][0]>=envelopes[j][0])&&(envelopes[dp[i]][1]>=envelopes[j][1]))) {
                    dp[i]=j;
                }
                //如果第i个信封大于j,且j的外层信封大于i,则j的外层信封更改为i
                if (((envelopes[i][0]>envelopes[j][0])&&(envelopes[i][1]>envelopes[j][1]))&&((envelopes[dp[j]][0]>=envelopes[i][0])&&(envelopes[dp[j]][1]>=envelopes[i][1]))) {
                    dp[j]=i;
                }
            }
        }
        int count=1;
//        while(dp[min]!=max){
//            System.out.println(envelopes[min][0]+" "+envelopes[min][1]);
//            min=dp[min];
//            count++;
//        }
//        do{
//            System.out.println(envelopes[min][0]+" "+envelopes[min][1]);
//            min=dp[min];
//            count++;
//        }while(dp[min]!=max);
        for(int i=0;i<n;i++){
            System.out.println("dp["+i+"]: "+dp[i]);
        }
        System.out.println(max+" "+ min);
        return count;
    }
}
