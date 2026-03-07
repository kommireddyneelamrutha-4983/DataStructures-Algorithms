package programs.dsa.com;
import java.util.*;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		int nums[] = {1,2,3,4,6,3};
        int k = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0,1);

        int sum = 0;
        int count = 0;

        for(int num : nums){

            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum,0) + 1);
        }

        System.out.println("Number of subarrays = " + count);
	}

}
