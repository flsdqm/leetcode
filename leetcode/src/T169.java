import java.util.Arrays;

public class T169 {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        return nums[n/2];
    }
}
