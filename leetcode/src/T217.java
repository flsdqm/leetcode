import java.util.Arrays;

public class T217 {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l-1;i++){
            if(nums[i]==nums[i+1])
                return true;
        }
        return false;
    }
}
