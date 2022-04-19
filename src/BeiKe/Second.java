package BeiKe;

import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] result = new int[n*2];
        int ans = getSum(15);
        System.out.println(ans);
        for(int i = 0; i<n; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();

            int sum = 0;
            for(int j = l; j<=r; j++){
                //if(j % getSum(j) == 1){
                if(j % S(j) == 1){
                    System.out.print(j);
                    System.out.print(" ");
                    sum++;
                }
            }
            System.out.println(sum);
        }

    }
    public static int S(int n){
        if(n<=9)
            return n;
        return n % 10 + S((n- (n % 10))/10);
    }

    public static int getSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); ++i) {
            sum += (int)(s.charAt(i) - '0');
        }
        return sum;
    }
}
