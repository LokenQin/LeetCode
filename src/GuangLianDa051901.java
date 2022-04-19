import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-19
 * @ClassName: GuangLianDa051901
 * @Description: TODO
 */
public class GuangLianDa051901 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        long Y = sc.nextLong();
        Long min , max;
        max = X>=Y? X:Y;
        min = X<=Y? X:Y;
        int count = 1;
        while(min<=max){
            min = min*2;
            count++;
        }
        System.out.println(count-1);
    }
}
