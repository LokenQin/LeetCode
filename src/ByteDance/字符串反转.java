package ByteDance;

import java.util.Scanner;

public class 字符串反转 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        String str = sc.next();
        int[] num = new int[n];
        for(int i = 0; i<q; i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            // 方法一 每次都对字母翻转
            // str = stringReverse(str,l, r);
            // 方法二 计算需要翻转的
            for(int j = l-1;j<=r-1;j++){
                num[j]=num[j]+1;
            }
        }
        for (int i = 0; i < n; i++) {
            num[i] = num[i] % 2;
        }
        begin:
        for(int i = 0; i < n; i++ ){
            if(num[i] == 1){
                if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                    str = str.replace(str.charAt(i),(char)(str.charAt(i)-32));
                    continue begin;
                }
                if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                    str = str.replace(str.charAt(i),(char)(str.charAt(i)+32));
                    continue begin;
                }
            }
        }
        System.out.println(str);
    }
    public static String stringReverse(String str,int l,int r){
        begin:
        for(int i = l-1;i<=r-1;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
                str = str.replace(str.charAt(i),(char)(str.charAt(i)-32));
                continue begin;
            }
            if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                str = str.replace(str.charAt(i),(char)(str.charAt(i)+32));
                continue begin;
            }

        }
        return str;
    }
}
