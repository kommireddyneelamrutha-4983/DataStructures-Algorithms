package programs.dsa.com;

public class PivotIndex {

	public static void main(String[] args) {

        int nums[] = {1,7,4,3,6,5,6,4};

        int totalSum = 0;

        for(int num : nums){
            totalSum += num;
        }

        int sum = 0;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] == totalSum - 2*sum){
                System.out.println("Pivot Index = " + i);
                return;
            }

            sum += nums[i];
        }

        System.out.println("No Pivot Index");
	}

}
