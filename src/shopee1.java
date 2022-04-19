public class shopee1 {
    public static void main(String[] args) {
        int[] nums = new int[]{4,3,1};
        System.out.println(Convert(nums));
    }
    public static long Convert(int[] nums){
        int length = nums.length-1;
        long result = 0l;
        for(int i=0;i<=length;i++){
            result = result*5+nums[i];
        }
        return result;
    }
}
