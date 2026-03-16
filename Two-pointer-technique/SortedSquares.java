import java.util.Arrays;

public class SortedSquares {

    public static int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] temp = new int[n];

        int i = 0;
        int j = n - 1;

        for (int index = n - 1; index >= 0; index--) {

            if (Math.abs(nums[i]) >= Math.abs(nums[j])) {
                temp[index] = nums[i] * nums[i];
                i++;
            } 
            else {
                temp[index] = nums[j] * nums[j];
                j--;
            }
        }

        return temp;
    }

    public static void main(String[] args) {

        int[] nums = {-7, -3, 2, 3, 11};

        int[] result = sortedSquares(nums);

        System.out.println("Sorted Squares Array: " + Arrays.toString(result));
    }
}
