import java.util.ArrayList;
import java.util.List;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-03-07
 * @ClassName: LeetCode131
 * @Description: TODO
 */
public class LeetCode131 {

    public static void main(String[] args) {
        List<List<String>> result = new ArrayList<>();
        Solution  s = new Solution();
        result = s.partition("abaa");

        System.out.println(result);


    }


}
class Solution{
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        List<String> ans = new ArrayList<String>();
        int local = 0,length = s.length();
        getReturn2(res,ans,s,0,length);
        return res;
    }
    public void getReturn(List<List<String>> res,List<String> ans,String s,int local,int length){
        if(length==local || s.length()==0){
            res.add(ans);
            return ;
        }
        //退出条件1.最后一个字符串长度为0;2.各个子字符串总长达到字符串总长
        for(int i = 0;i<s.length();i++){
            if(judgeString(s.substring(0,i+1))){//如果子字符串是回文字符串
                List<String> temp =new ArrayList<String>();
                temp = ans;
                int a;
                a = local+i+1;//判断已经找到的字符长度是否等于总长
                temp.add(s.substring(0,i+1));
                getReturn(res,temp,s.substring(i+1),a,length);
            }else{

            }
        }

    }
    //改
    public void getReturn2(List<List<String>> res,List<String> ans,String s,int start,int end){
        if(start == end){
            res.add(ans);
            return ;
        }else{
            //退出条件1.最后一个字符串长度为0;2.各个子字符串总长达到字符串总长
            List<String> temp =new ArrayList<String>();
            temp = ans;
            for(int i = start;i<s.length();i++){
                if(judgeString(s.substring(start,i+1))){//如果子字符串是回文字符串

                    int a = i+1;//判断已经找到的字符长度是否等于总长
                    temp.add(s.substring(start,i+1));
                    getReturn2(res,temp,s,a,end);
                }else{

                }
            }
        }


    }
    public boolean judgeString(String s){//判断字符串是否为回文字符串
        boolean flag = true;
        for(int i = 0;i<(s.length()/2.0);i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                flag = false;
                break;
            }
        }
        return flag;
    }
}