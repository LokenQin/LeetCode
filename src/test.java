import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-03-18
 * @ClassName: test
 * @Description: TODO
 */
public class test {
    static int calcSimilarity(String name1, String name2) {
        int res = 0,theLength = 0,innerLength=0;
        String[] n1 = name1.split(" ");	//获得name1的字符串数组 按照" "分割
        String[] n2 = name2.split(" ");	//获得name2的字符串数组 按照" "分割
        //System.out.println(n1.length);
        //System.out.println(n2.length);

        if(n1.length>=n2.length){//筛选最短的名字
            theLength = n2.length;
            for(int i = 0; i<theLength;i++){//遍历每一个拼音
                if(n1[i].length()>=n2[i].length()){
                    innerLength = n2[i].length();
                    for(int j = 0;j<innerLength;j++){
                        if(n1[i].charAt(j)==n2[i].charAt(j)){
                            res = res+0;
                        }else{
                            res = res + n1[i].charAt(j)+n2[i].charAt(j);
                        }
                    }
                    for(int j = innerLength ;j<n1[i].length();j++){
                        res = res + n1[i].charAt(j);
                    }
                }else{
                    innerLength = n1[i].length();
                    for(int j = 0;j<innerLength;j++){
                        if(n1[i].charAt(j)==n2[i].charAt(j)){
                            res = res+0;
                        }else{
                            res = res + n1[i].charAt(j)+n2[i].charAt(j);
                        }
                    }
                    for(int j = innerLength ;j<n2[i].length();j++){
                        res = res + n2[i].charAt(j);
                    }
                }
            }
            for(int i = theLength;i<n1.length;i++){
                for (int j = 0;j<n1[i].length();j++){
                    res = res + n1[i].charAt(j);
                }
            }

        }else{
            theLength = n1.length;
            for(int i = 0 ;i<theLength;i++){
                if(n1[i].length()>=n2[i].length()){
                    innerLength = n2[i].length();
                    for(int j = 0;j<innerLength;j++){
                        if(n1[i].charAt(j)==n2[i].charAt(j)){
                            res = res+0;
                        }else{
                            res = res + n1[i].charAt(j)+n2[i].charAt(j);
                        }
                    }
                    for(int j = innerLength ;j<n1[i].length();j++){
                        res = res + n1[i].charAt(j);
                    }
                }else{
                    innerLength = n1[i].length();
                    for(int j = 0;j<innerLength;j++){
                        if(n1[i].charAt(j)==n2[i].charAt(j)){
                            res = res+0;
                        }else{
                            res = res + n1[i].charAt(j)+n2[i].charAt(j);
                        }
                    }
                    for(int j = innerLength ;j<n2[i].length();j++){
                        res = res + n2[i].charAt(j);
                    }
                }
            }
            for(int i = theLength;i<n2.length;i++){
                for (int j = 0;j<n2[i].length();j++){
                    res = res + n2[i].charAt(j);
                }
            }
        }

        return res;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String name1 = in.nextLine();
            String name2 = in.nextLine();

            int sum = calcSimilarity(name1, name2);
            System.out.println(sum);
        }
    }
}
