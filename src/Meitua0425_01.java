import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-25
 * @ClassName: Meitua0425_01
 * @Description: TODO
 */
public class Meitua0425_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        for(int i = 0;i<n;i++){
            int goal = sc.nextInt();
            int temp = (goal-1)%c;
            int index = goal-(temp*c);
            char target = (char)('A'+temp-0);
            System.out.println(""+target+index);
        }


    }
}
