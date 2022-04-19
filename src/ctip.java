/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-03-18
 * @ClassName: ctip
 * @Description: TODO
 */
public class ctip {
    public static void main(String[] args) {
        String a = "我想你了";
        System.out.println(a.indexOf("你"));
        a=a.replaceAll("我想","我想:[停用词] ");
        System.out.println(a);
    }
}
