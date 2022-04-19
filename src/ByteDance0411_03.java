import java.util.Scanner;

/**
 * @Version:v1.0
 * @Author: 鲁坤
 * @Date: 2021-04-12
 * @ClassName: ByteDance0411_03
 * @Description: TODO
 */
public class ByteDance0411_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i=0;i<n;i++){
            int num = scanner.nextInt();
            int[][] score = new int[num][5];
            for(int j=0;j<num;j++){
                score[j][0]=scanner.nextInt();
                score[j][1]=scanner.nextInt();
                score[j][2]=scanner.nextInt();
                score[j][3]=scanner.nextInt();
                score[j][4]=scanner.nextInt();
            }
            int max=0,first=0,second=0;

        }
    }
}
