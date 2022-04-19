import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-25
 * @ClassName: Meituan0425_02
 * @Description: TODO
 */
public class Meituan0425_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine();			//目标字符串
        int n = sc.nextInt();					//操作次数
        //---------------------------------
        int length = target.length();
        int[] arrays = new int[length];
        for(int i = 0;i<n;i++){
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int stripe = sc.nextInt();
            for(int j=begin-1;j<end;j++){
                arrays[j]=arrays[j]+stripe;
            }
        }
        for(int i=0;i<length;i++){
            arrays[i]=(26-(arrays[i]%26));
        }
        String res = "";
        for(int i=0;i<length;i++){
            char goal = target.charAt(i);
            int newStripe = (goal-'a'+arrays[i])%26;
            char newGoal = (char)('a'+newStripe);
            res = res+newGoal;
        }
        System.out.println(res);
        /*for(int i = 0;i<n;i++){
            int begin = sc.nextInt();
            int end = sc.nextInt();
            int stripe = sc.nextInt();
            target = handleStr(target,begin,end,stripe);
        }*/
        //System.out.println(target);


    }
    // 对字符串指定区间的值向前移动
    public static String handleStr(String str, int begin,int end,int stripe){
        int length = str.length();
        int temp = stripe%26;			//移动步长优化
        int newTemp = 26-temp;			//前移n位 相当于后移(26-n)位
        String change="";
        for(int i=begin-1;i<end;i++){
            char goal = str.charAt(i);
            int newStripe = (goal-'a'+newTemp)%26;
            char newGoal = (char)('a'+newStripe);
            change=change+newGoal;
        }
        String head = str.substring(0,begin-1);
        String tail = str.substring(end,length);
        return (head+change+tail);
    }
}
