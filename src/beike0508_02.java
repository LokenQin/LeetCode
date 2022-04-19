import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-08
 * @ClassName: beike0508_02
 * @Description: TODO
 */
public class beike0508_02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            //数目
        HashMap<Integer, Integer> res = new HashMap<>();
        for(int i=0;i<n;i++){
            int size = sc.nextInt();
            res.put(size, res.getOrDefault(size,0)+1);
        }
        int max = 0;
        for(Map.Entry<Integer,Integer>everyPie:res.entrySet()){
            if(max<everyPie.getValue()){
                max = everyPie.getValue();
            }
        }
        System.out.println(max);
    }
}
