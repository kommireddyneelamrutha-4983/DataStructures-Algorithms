public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        int n = nums.length;

        for (int j = 1; j < n; j++) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4,5};

        int k = removeDuplicates(nums);

        System.out.println("Number of unique elements: " + k);

        System.out.print("Array after removing duplicates: ");
        for(int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
