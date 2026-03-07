package programs.dsa.com;
import java.util.Arrays;

//

public class PrefixSum {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
        int n = arr.length;

        int prefix[] = new int[n];

        prefix[0] = arr[0];

        for(int i = 1; i < n; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        System.out.println("Prefix Sum Array:");
        System.out.println(Arrays.toString(prefix));
        int L=1;
        int R=4;
        int sum;
        if(L==0)
        {
        	sum=prefix[R];
        	
        }
        else {
        	sum=prefix[R]-prefix[L-1];
        	
        }
        System.out.println("sum from index " + L +" to  "+ R +" is " + sum);

	}

}
