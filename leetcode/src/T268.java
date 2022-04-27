import java.util.Arrays;

public class T268 {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return n;
    }
}
