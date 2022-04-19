public class LeetCode189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        rotate(nums,0);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
    public static void rotate(int[] nums, int k){
        int length = nums.length;

        for(int i = 0; i<=(length-k-1)/2;i++){
            int temp = nums[i];
            nums[i] = nums[length-k-1-i];
            nums[length-k-1-i] = temp;
        }

        for(int i = length-k;i<=length-k+(k-1)/2;i++) {
            int temp = nums[i];
            nums[i] = nums[length-k+length-1-i];
            nums[length-k+length-1-i] = temp;
        }

        for(int i = 0; i<=(length-1)/2; i++){
            int temp = nums[i];
            nums[i] = nums[length-1-i];
            nums[length-1-i] = temp;
        }
    }
}
