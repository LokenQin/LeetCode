public class LeetCode74 {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(searchMatrix(matrix, target));
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        //先搜行 再搜列
        int low = 0, high = matrix.length-1;
        int length = matrix.length, width = matrix[0].length;
        boolean flag = false;
        while(low <= high) {
            int middle = low + (high-low) / 2;
            if(target < matrix[middle][0]) {
                high = middle-1;
            }else if(target > matrix[middle][width-1] ){
                low = middle+1;
            }else{
                int begin = 0, end = width-1;
                while(begin <= end){
                    int newMiddle = begin + (end-begin)/2;
                    if(target < matrix[middle][newMiddle]){
                        end = newMiddle-1;
                    }else if(target == matrix[middle][newMiddle]){
                        flag = true;
                        break;
                    }else{
                        begin = newMiddle+1;
                    }
                }
                break;
            }
        }
        return flag;
    }
}
