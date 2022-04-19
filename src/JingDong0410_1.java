import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-10
 * @ClassName: JingDong0410_1
 * @Description: TODO
 */
public class JingDong0410_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] k = new int[t+1];         //  定义斜率数组
        int[] b = new int[t+1];         //  定义截距数组
        int[] count = new int[t+1];     //  定义交点数量数组
        for(int i = 1 ; i<=t ; i++){
            k[i]=in.nextInt();
            b[i]=in.nextInt();
        }

    }
}
