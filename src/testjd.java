import com.sun.javafx.collections.MappingChange;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-10
 * @ClassName: testjd
 * @Description: TODO
 */
public class testjd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        while(true){
            double target = in.nextDouble();
            int nums = in.nextInt();
            double result = 0.00;
            for(int i = 0 ; i<nums;i++){
                result = result+target;
                target = Math.sqrt(target);
            }
            System.out.println(df.format(result));
        }

    }
}
