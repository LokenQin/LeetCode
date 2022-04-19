import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-19
 * @ClassName: GuangLianDa0519_01
 * @Description: TODO
 */
public class GuangLianDa0519_01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[]a = new int[n];
        //初始化数组a
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int[] result = new int[n+1];	//总操作
        for(int i=0;i<m;i++){
            int begin = sc.nextInt();
            int ending = sc.nextInt();
            int sugar = sc.nextInt();

            for(int j=begin;j<=ending;j++){
                result[j-1] = (result[j-1]+(j-begin+1)*sugar)%1000000007;

            }
        }
        for(int i=0;i<n;i++){
            System.out.print(((a[i]+result[i])%1000000007)+" ");
        }
    }
}
class Solution12{
    public void getResult(List<List<Long>>res,List<Long>ans,long X,long Y){
        if(X>Y){
            res.add(ans);
            return;
        }else{
            for(long i=X;i<=Y;i++){
                List<Long>temp = new ArrayList<Long>();
                temp.addAll(ans);
                if(temp.size()==0){
                    temp.add(i);
                    getResult(res,temp,i+1,Y);
                }else{
                    int length = temp.size();
                    if((i%(temp.get(length-1)))==0 && (i>temp.get(length-1))){
                        temp.add(i);

                    }
                    getResult(res,temp,i+1,Y);
                }
            }
        }
    }
}