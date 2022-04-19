import java.util.ArrayList;
import java.util.List;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-03-08
 * @ClassName: LeetCode132
 * @Description: TODO
 */
public class LeetCode132 {
    public static void main(String[] args) {
        //List<List<String>> result = new ArrayList<>();
        Solution1  s = new Solution1();
        int result = s.minCut("abaa");

        System.out.println(result);
    }
}
class Solution1 {
    public int minCut(String s) {
        List<List<String>> res =new ArrayList<List<String>>();
        List<String>ans = new ArrayList<String>();
        if(s.equals("")){
            return 0;
        }else{
            getReturn(res,ans,s,0,s.length());
            System.out.println(res);
            int result = (res.get(0)).size();
            for(int i = 0;i<res.size();i++ ){
                if((res.get(i)).size()<result){
                    result = (res.get(i)).size();
                }
            }
            return result;
        }


    }
    //查找所有的可能 返回回文字符串列表
    public void getReturn(List<List<String>> res,List<String> ans,String s, int start,int end){
        if(start == end){
            res.add(ans);
            return ;
        }else{
            for(int i = start ; i<end ;i++){

                if(judgeString(s.substring(start,i+1))){
                    List<String> temp = new ArrayList<String>();
                    copyList(temp,ans);
                    int a = i +1 ;
                    temp.add(s.substring(start,i+1));
                    getReturn(res,ans,s,a,end);
                }else{

                }
            }
        }
    }
    //判断是否为回文字符串
    public boolean judgeString(String s){
        boolean flag = true;
        if(s.equals("")){
            return false;
        }else{
            for(int i = 0 ; i<(s.length()/2.0);i++){
                if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                    flag = false;
                    break;
                }
            }
        }
        return flag;

    }
    public void copyList(List<String> a,List<String>b){
        for(int i = 0; i< b.size();i++){
            a.add(b.get(i));
        }
    }
}
