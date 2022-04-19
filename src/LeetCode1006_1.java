import java.util.Stack;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-01
 * @ClassName: LeetCode1006_1
 * @Description: TODO
 */
public class LeetCode1006_1 {
    public static void main(String[] args) {
        Solution1006_1 solution1006 = new Solution1006_1();
        int ans= solution1006.clumsy(5);
        System.out.println(ans);
    }
}
class Solution1006_1 {
    public int clumsy(int N) {
        Stack<Character> cstack = new Stack<Character>();
        Stack<Integer> Istack = new Stack<Integer>();
        String res = "";
        if (N <= 1) {
            return 1;
        } else {
            int flag = 1; //判断这是第几个数字
            while (N >= 2) {
                if (flag == 1) {
                    res = res + N + "*";
                    N--;
                    flag = 2;
                } else if (flag == 2) {
                    res = res + N + "/";
                    N--;
                    flag = 3;
                } else if (flag == 3) {
                    res = res + N + "+";
                    N--;
                    flag = 4;
                } else {
                    res = res + N + "-";
                    N--;
                    flag = 1;
                }
            }

            System.out.println(res);
            return 0;
        }
    }
}
