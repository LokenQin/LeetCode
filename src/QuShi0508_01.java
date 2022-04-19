import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-08
 * @ClassName: QuShi0508_01
 * @Description: TODO
 */
public class QuShi0508_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        int x = sc.nextInt();
        int length = N.length();
        int[] string_to_number = new int[length];
        boolean[] reamin_it= new boolean[length];
        //初始化
        for(int i=0;i<length;i++){
            string_to_number[i]=(N.charAt(i)-'0');
            reamin_it[i]=false;
        }
        int remain = length-x;
        int begin = 0;
        //思路 这一题要求去掉x位，使得剩下的数字Y最小，其实可以转化为保留（length-x）位使得得到的数字Y最小
        while(remain!=0){
            int temp_min = begin;
            for(int i=begin;i<=length-remain;i++){
                if(string_to_number[temp_min]>string_to_number[i]){
                    temp_min=i;
                }
            }
            reamin_it[temp_min]=true;
            begin = temp_min+1;
            remain = remain-1;

        }
        int[] res = new int[length-x];
        int count = 0;
        for(int i=0;i<length;i++){
            if(reamin_it[i]==true){
                res[count]=string_to_number[i];
                count++;
            }
        }
        int result=0;
        for(int i=0;i<(length-x);i++){
            result = result*10+res[i];
        }
        System.out.println(result);

    }

}
