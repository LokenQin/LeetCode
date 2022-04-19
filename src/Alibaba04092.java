import sun.misc.Queue;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-09
 * @ClassName: Alibaba04092
 * @Description: TODO
 */
public class Alibaba04092 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();               //获取数组长度
        int times = in.nextInt();                //获取操作次数
        int[] nums = new int[length + 1];
        for (int i = 0; i < length + 1; i++) {        //构建数组并赋值
            nums[i] = i + 1;
        }
        for (int i = 0; i < times; i++) {
            int left = in.nextInt();
            int right = in.nextInt();
            swap(nums, left, right);
        }
        for (int i = 1; i <= length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
    public static void swap(int[] nums, int left, int right) {
        int middle = (left + right) / 2;
        for (int i = left; i <= middle; i++) {
            int temp = nums[i];
            nums[i] = nums[right];
            nums[right] = temp;
            right--;
        }
    }
}
