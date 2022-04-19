public class LeetCode917 {
    public static void main(String[] args) {
        String str = "7_28]";
        System.out.println(reverseOnlyLetters(str));
    }
    public static String reverseOnlyLetters(String s) {
        // 双指针
        int left = 0, right = s.length()-1;
        char[] temp = new char[s.length()];
        String result = "";
        for(int i=0; i<s.length();i++){
            temp[i] = s.charAt(i);
        }
        while(right>=0 && left<s.length() && left<right){
            while(left<s.length() && (((temp[left]-'A')>25 && (temp[left]-'A')<32) || temp[left] -'A' <0)){
                left++;
            }
            while(right>=0 && (((temp[right]-'A')>25 && (temp[right]-'A')<32) || temp[right] -'A' <0)){
                right--;
            }
            if(left>=right){
                break;
            }
            // 判断字符
            if((temp[left]-'A' <=25 || temp[left]-'A' >=32) && (temp[right]-'A' <=25 || temp[right]-'A' >=32)){
                swap(temp, left, right);
                left++;
                right--;
            }
        }
        for(int i=0; i<s.length();i++){
            result = result + temp[i];
        }
        return result;
    }
    //交换字母
    public static String exchange(String s, int left, int right) {
        char c1 = s.charAt(left);
        char c2 = s.charAt(right);
        String str_left = s.substring(0, left);
        String str_middle = s.substring(left+1,right);
        String str_right = s.substring(right+1,s.length());
        return str_left+c2+str_middle+c1+str_right;

    }
    public static void swap(char[] target, int left,int right) {
        char temp = target[left];
        target[left] = target[right];
        target[right] = temp;
    }
}
