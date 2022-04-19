import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-13
 * @ClassName: Ctrip0513_02
 * @Description: TODO
 */
public class Ctrip0513_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //开始时间数组
        int[] startTime = new int[n];
        //结束时间数组
        int[] endTime = new int[n];
        //价位数组
        int[] profit = new int[n];
        int res = 0;
        for(int i=0;i<n;i++){
            startTime[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            endTime[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            profit[i]=sc.nextInt();
        }
        //dp数组初始化 存放对应时间段的利润
        int[][]dp = new int[25][25];
        for(int i=0;i<startTime.length;i++){
            dp[startTime[i]][endTime[i]] = profit[i];
        }
        if(n==1){
            res=profit[0];
        }else{
            List<List<int[]>> res1 = new ArrayList<>();
            List<int[]> ans = new ArrayList<>();
            solution solution = new solution();
            solution.getResult(res1,ans,startTime,endTime,0);
            for(int i=0;i<res1.size();i++){
                List<int[]> ints = res1.get(i);
                int temp=0;
                for(int j=0;j<ints.size();j++){
                    temp = temp + dp[ints.get(j)[0]][ints.get(j)[1]];
                }
                if(res<temp){
                    res = temp;
                }
            }

        }
        System.out.println(res);
    }

}
class solution{
    void getResult(List<List<int[]>>res,List<int[]>ans,int[] beginTime,int[] endTime,int location){
        if(location>= beginTime.length){
            res.add(ans);
            return;
        }else{
            for(int i=location;i< beginTime.length;i++){
                ArrayList<int[]> ints1 = new ArrayList<>();
                ints1.addAll(ans);
                if(ints1.size()==0){
                    int[] ints = new int[2];
                    ints[0] = beginTime[i];
                    ints[1] = endTime[i];
                    ints1.add(ints);
                }else{
                    if(ints1.get((ints1.size())-1)[1]<=beginTime[i]){
                        int[] ints = new int[2];
                        ints[0] = beginTime[i];
                        ints[1] = endTime[i];
                        ints1.add(ints);
                    }else{

                    }
                }
                getResult(res,ints1,beginTime,endTime,i+1);
            }
        }
    }
}
