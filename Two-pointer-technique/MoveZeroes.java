public class MoveZeroes {

    public static void moveZeroes(int[] nums) {

        int n = nums.length;
        int i = 0;

        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {

                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        moveZeroes(nums);

        System.out.print("Array after moving zeroes: ");

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
