import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-05-08
 * @ClassName: BeiKe0508_01
 * @Description: TODO
 */

/*
3 2
apple 1 10
pear 1 6
bike 100 1
apple 10
bike 1


* */
public class BeiKe0508_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            //库存数
        int m = sc.nextInt();            //订单数
        Map<String, Integer> commodity_price = new HashMap<>();
        Map<String, Integer> commodity_numbers = new HashMap<>();
        Map<String, Integer> commodity_order = new HashMap<>();
        //处理库存数据 切割成<name,price> <name,number>键值对
        //获取异常
        String other = sc.nextLine();
        for(int i=0;i<n;i++){
            String commodity_profit_num = sc.nextLine();
            String[] s = commodity_profit_num.split(" ");       //s[0]商品名 s[1]价格  s[2]数量
            String cName = s[0];
            String cPrice = s[1];
            String cNumber = s[2];
            int price = 0;
            int number = 0;
            for(int j=0;j<cPrice.length();j++){
                price = price*10+(cPrice.charAt(j)-'0');
            }
            for(int j=0;j<cNumber.length();j++){
                number = number*10+(cNumber.charAt(j)-'0');
            }
            commodity_price.put(cName,price);
            commodity_numbers.put(cName,number);
        }
        //处理订单数据 切割成 <name,number>键值对
        for(int i=0;i<m;i++){
            String commodity_profit_num = sc.nextLine();
            String[] s = commodity_profit_num.split(" ");       //s[0]商品名 s[1]价格  s[2]数量
            String cName = s[0];
            String cNumber = s[1];
            int number = 0;
            for(int j=0;j<cNumber.length();j++){
                number = number*10+(cNumber.charAt(j)-'0');
            }
            commodity_order.put(cName,number);
        }
        boolean flag = true;
        int profit=0;
        int count=0;
        for(Map.Entry<String,Integer>erverOrder:commodity_order.entrySet()){
            String name = erverOrder.getKey();
            int num = erverOrder.getValue();
            if(commodity_numbers.get(name)<num){
                count++;
                profit = count*(-1);
                flag = false;
                break;
            }else{
                count++;
                profit = profit+(commodity_price.get(name))*num;
            }
        }
        System.out.println(profit);
    }
}
