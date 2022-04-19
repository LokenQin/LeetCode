import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-01
 * @ClassName: LeetCode47
 * @Description: TODO
 */
public class LeetCode47 {
    public static void main(String[] args) {
        int[] res = new int[]{-4,-2,-1,0,1,1,2,4};
        Solution47 solution47 = new Solution47();
        List<List<Integer>> lists = solution47.threeSum(res);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
class Solution47 {
    public List<List<Integer>> threeSum(int[] nums) {
        //思路一：回溯算法 结果超时
        Arrays.sort(nums);                  //对数组进行升序排序
        List<List<Integer>>res = new ArrayList<List<Integer>>();
        // List<Integer> ans = new ArrayList<Integer>();
        // getRestlt(res,ans,nums,0);
        // List<List<Integer>>res2 = new ArrayList<>(new HashSet<>(res));
        // return res2;
        //思路二：双指针
        int left=0, right = nums.length-1;  //定义指向左右两侧的指针
        List<Integer>ans = new ArrayList<Integer>();
        while(left<right){                  //nums[left]<=nums[right]
            ans.add(nums[left]);
            ans.add(nums[right]);
            if((ans.get(0)+ans.get(1))<0){
                int temp = right-1;
                while((ans.get(0)+ans.get(1)+nums[temp])!=0&&temp>left){
                    temp--;
                }
                if(temp>left){
                    ans.add(nums[temp]);
                    res.add(ans);
                    ans.clear();
                }
                ans.clear();
                left++;
            }else if((ans.get(0)+ans.get(1))==0){
                int temp = right-1;
                while((ans.get(0)+ans.get(1)+nums[temp])!=0&&temp>left){
                    temp--;
                }
                if(temp>left){
                    ans.add(nums[temp]);
                    res.add(ans);
                    ans.clear();
                }
                ans.clear();
                left++;
            }else{
                int temp = left+1;
                while((ans.get(0)+ans.get(1)+nums[temp])!=0&&temp<right){
                    temp++;
                }
                if(temp<right){
                    ans.add(nums[temp]);
                    res.add(ans);
                    ans.clear();
                }
                ans.clear();
                right--;
            }
        }
        return res;
    }


    public void getRestlt(List<List<Integer>> res,List<Integer> ans,int[] nums,int now){
        if(ans.size()>3){
            return;
        }
        if(ans.size()==3 && (ans.get(0)+ans.get(1)+ans.get(2))==0){
            res.add(ans);
            return ;
        }else{
            for(int i=now;i<nums.length;i++){
                List<Integer> temp = new ArrayList<Integer>();
                temp.addAll(ans);
                temp.add(nums[i]);
                getRestlt(res,temp,nums,i+1);
            }
        }
    }
}