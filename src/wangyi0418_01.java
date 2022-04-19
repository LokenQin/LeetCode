import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-18
 * @ClassName: wangyi0418_01
 * @Description: TODO
 */
public class wangyi0418_01 {
    public static void main(String[] args) {
        int[][] ints1= new int[2][2];
        List<List<Integer>> lists = new ArrayList<>();
        for(int i=0;i<2;i++){
            List<Integer> integers = new ArrayList<>();
            for(int j=0;j<2;j++){
                if(j==1)  integers.add(j);
                System.out.println(ints1[i][j]);
            }
            Object[] objects = integers.toArray();
            System.out.println(objects[0]);
            lists.add(integers);
        }
        Object[] objects = lists.toArray();
        System.out.println(objects[0]);
        for(int i=0;i<2;i++){

            for(int j=0;j<2;j++){

                //System.out.println(ints[i][j]);
            }

        }
        System.out.println(lists);

    }
}
