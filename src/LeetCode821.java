import java.util.ArrayList;
import java.util.List;

public class LeetCode821 {
    public static void main(String[] args) {
        String s = "aaba";
        char c = 'b';
        for (int i : shortestToChar(s, c)) {
            System.out.print(i + " ");
        }
    }
    public static int[] shortestToChar(String s, char c) {
        int length = s.length();
        int[] result = new int[length];
        List<Integer> cLocation = new ArrayList<>();
        for(int i=0; i<length; i++) {
            if(s.charAt(i)==c){
                cLocation.add(i);
            }
        }
        int count = 0;
        for(int i=0; i<length; i++) {
            if(i < cLocation.get(count)){
                if(count-1 >=0) {
                    result[i] = Math.min(Math.abs(i - cLocation.get(count)), Math.abs(i - cLocation.get(count-1)));
                }else{
                    result[i] = Math.abs(i - cLocation.get(count));
                }
            }else if(i == cLocation.get(count)){
                result[i] = 0;
                if(count+1<cLocation.size()){
                    count++;
                }
            }else{
                if (count+1 < cLocation.size()) {
                    result[i] = Math.min(Math.abs(i - cLocation.get(count)), Math.abs(i - cLocation.get(count+1)));
                }else{
                    result[i] = Math.abs(i - cLocation.get(count));
                }
            }
        }
        return result;
    }
}
