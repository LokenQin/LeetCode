import java.util.HashMap;
import java.util.Map;

public class LeetCode819 {
    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = new String[] {"a"};
        System.out.println(mostCommonWord(paragraph,banned));
    }
    public static String mostCommonWord(String paragraph, String[] banned) {
        String result = "";
        Map<String, Integer> count = new HashMap<>();
        // 替换
        paragraph = (paragraph.replaceAll("\\,|\\.|\\!|\\?|\\'|\\;", " ")).toLowerCase();
        String[] allWords = paragraph.split(" ");
        for(int i=0;i<allWords.length;i++){
            count.put(allWords[i], count.getOrDefault(allWords[i], 0) + 1);
        }
        for(String i : banned){
            count.put(i, 0);
        }
        int max = 0;
        for(Map.Entry<String,Integer> entrySet : count.entrySet()) {
            if(max < entrySet.getValue()){
                result = entrySet.getKey();
                max = entrySet.getValue();
            }
        }
        return result;
    }
}
