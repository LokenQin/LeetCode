package ByteDance;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class 模糊回文字符串 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(judge(str));
    }

    public static boolean judge(String str) {
        boolean result = true;
        String newStr = str.toLowerCase();
        StringBuilder sb_init = new StringBuilder();
        Map<Character, Integer> charMap = new HashMap<>();
        for (int i = 0; i < newStr.length(); i++) {
            if (newStr.charAt(i) >= 'a' && newStr.charAt(i) <= 'z') {

            } else {
                newStr = newStr.replace(newStr.charAt(i), '*');
            }
        }
        for (int i = 0; i < newStr.length(); i++) {
            charMap.put(newStr.charAt(i), charMap.getOrDefault(newStr.charAt(i), 0) + 1);
        }
        int starNum = charMap.get('*') % 2 == 0 ? 0 : 1;
        int everyCharNum = 0;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getKey() >= 'a' && entry.getKey() <= 'z' && entry.getValue() % 2 != 0) {
                everyCharNum++;

            }
            if (newStr.length() % 2 == 0) {
                if (starNum != 0 || everyCharNum != 0) {
                    result = false;
                }
            } else {
                if ((starNum == 0 && everyCharNum == 1) || (starNum == 1 && everyCharNum == 0)) {

                } else {
                    result = false;
                }
            }

        }
        return result;
    }
}
