import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-04
 * @ClassName: LeetCode18
 * @Description: TODO
 */
public class LeetCode18 {
    public static void main(String[] args) {
        Solution18 solution18 = new Solution18();
        int [] nums = new int [] {1,0,-1,0,-2,2};
        List<List<Integer>> lists = solution18.fourSum(nums, 0);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }
    }
}
class Solution18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> nList = new ArrayList<Integer>();
        for(int i =0;i<nums.length;i++){
            nList.add(nums[i]);
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int leftest=0,rightest=nums.length-1;
        //思路：二次查找target
        for(int i=leftest;i<nums.length-3;i++){        //最左指针右移
            for(int j = rightest;j>i+2;j--){             //最右指针左移
                int newTarget = target-(nums[i]+nums[j]);   //转化为求二数之和
                int left = i+1,right=j-1;                   //如何使用一层循环搞定？？？ left为次左，right为次右
                while(left<right){
                    if((nums[left]+nums[right])-newTarget<0){
                        left++;
                    }else if((nums[left]+nums[right])-newTarget==0){
                        List<Integer> ans = new ArrayList<>();
                        ans.add(nums[i]);
                        ans.add(nums[left]);
                        ans.add(nums[right]);
                        ans.add(nums[j]);
                        res.add(ans);
                        left++;
                        right--;
                    }else{
                        right--;
                    }





                    /*if(newTarget<=0){                       //newTarget小于等于零，则可能出现在左边
                        int dis = newTarget-nums[left];     //newTarget与次左端的差值
                        if(nList.contains(dis)&&(left<nList.indexOf(dis)&&nList.indexOf(dis)<=right)){      //dis在(left,right]中存在，则返回
                            List<Integer> ans = new ArrayList<>();
                            ans.add(nums[i]);
                            ans.add(nums[left]);
                            ans.add(nums[nList.indexOf(dis)]);
                            ans.add(nums[j]);
                            res.add(ans);
                            left++;
                            right=nList.indexOf(dis)-1;
                        }else{
                            left++;
                        }
                    }else {                                 //newTarget大于零，则可能出现在右边
                        int dis = newTarget-nums[right];
                        if(nList.contains(dis)&&(left<=nList.indexOf(dis)&&nList.indexOf(dis)<right)){
                            List<Integer> ans = new ArrayList<>();
                            ans.add(nums[i]);
                            ans.add(nums[nList.indexOf(dis)]);
                            ans.add(nums[right]);
                            ans.add(nums[j]);
                            res.add(ans);
                            right--;
                            left=nList.indexOf(dis)+1;
                        }else{
                            right--;
                        }
                    }*/
                }



                }

        }
        List<List<Integer>>res2 =  new ArrayList<>(new HashSet<>(res));
        return res2;


    }
}