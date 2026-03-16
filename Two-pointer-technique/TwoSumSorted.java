import java.util.Arrays;

public class TwoSumSorted {

    public static int[] twoSum(int[] numbers, int target) {

        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {

            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};   // 1-indexed
            }
            else if (sum > target) {
                j--;
            }
            else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(numbers, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
