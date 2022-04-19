import com.sun.org.apache.regexp.internal.RE;

import java.util.Stack;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-03-12
 * @ClassName: LeetCode331
 * @Description: TODO
 */
public class LeetCode331 {
    public static void main(String[] args) {
        String preorder = "9,3,4,#,#,1,#,#,2,#,6,#,#";
        lsolution lsolution = new lsolution();
        lsolution.isValidSerialization(preorder);
    }
}
class lsolution{

        public boolean isValidSerialization(String preorder) {
            String[] sarray = preorder.split(",");
            boolean flag = true;
            int location = 0;
            Stack<String> sstack = new Stack<String>();
            for(int i = 0;i<sarray.length;i++){
                System.out.println(sarray[i]);
                if(sarray[i].contains("#")){

                }
            }
            return true;
        }


}