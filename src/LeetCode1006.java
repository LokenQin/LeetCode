import java.util.Stack;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-01
 * @ClassName: LeetCode1006
 * @Description: TODO
 */
public class LeetCode1006 {
    public static void main(String[] args) {
        Solution1006 solution1006 = new Solution1006();
        int ans= solution1006.clumsy(10);
        System.out.println(ans);
    }
}
class Solution1006 {
    public int clumsy(int N) {
        String res="";
        if(N<=1){
            return 1;
        }else{
            int flag=1; //判断这是第几个数字
            while(N>=2){
                if(flag==1){
                    res = res + N + "*";
                    N--;
                    flag=2;
                }else if(flag==2){
                    res = res + N+"/";
                    N--;
                    flag=3;
                }else if(flag==3){
                    res = res + N+"+";
                    N--;
                    flag=4;
                }else{
                    res = res + N+"-";
                    N--;
                    flag=1;
                }
            }
            res = res +"1";
            //System.out.println(res);
            return getResult(res);
        }
    }
    //
    public int getResult(String res){
        Stack<Character>cstack = new Stack<Character>();
        Stack<Integer>Istack = new Stack<Integer>();
        for(int i=0;i<res.length();i++){//提取数字
            if(res.charAt(i)>='0'&&res.charAt(i)<='9'){
                int temp = 0;
                do {
                    temp=temp*10+(res.charAt(i)-'0');
                    i++;
                }while(i<res.length()&&res.charAt(i)>='0'&&res.charAt(i)<='9');
                i--;
                //System.out.println(temp);
                Istack.push(temp);
            }else{//提取运算符
                if(res.charAt(i)=='*'){
                   //System.out.println(res.charAt(i));
                    int top = Istack.pop();
                    int temp = 0;
                    i++;//后移
                    do {
                        temp=temp*10+(res.charAt(i)-'0');
                        i++;
                    }while(i<res.length()&&res.charAt(i)>='0'&&res.charAt(i)<='9');
                    i--;
                    Istack.push(top*temp);
                }else if(res.charAt(i)=='/'){
                    //System.out.println(res.charAt(i));
                    int top = Istack.pop();
                    int temp = 0;
                    i++;//后移
                    do {
                        temp=temp*10+(res.charAt(i)-'0');
                        i++;
                    }while(i<res.length()&&res.charAt(i)>='0'&&res.charAt(i)<='9');
                    i--;
                    Istack.push(top/temp);
                }else if(res.charAt(i)=='+'){
                    cstack.push(res.charAt(i));
                    //System.out.println(res.charAt(i));
                }else {
                    cstack.push('+');
                    //System.out.println(res.charAt(i));
                    int temp = 0;
                    i++;//后移
                    do {
                        temp=temp*10+(res.charAt(i)-'0');
                        i++;
                    }while(i<res.length()&&res.charAt(i)>='0'&&res.charAt(i)<='9');
                    i--;
                    Istack.push(temp*(-1));
                }
                
            }
        }
        //判断字符栈是否为空
        while(!cstack.empty()){
            int a=Istack.pop();
            int b=Istack.pop();
            cstack.pop();
            Istack.push(a+b);

        }
        return Istack.peek();
    }

}