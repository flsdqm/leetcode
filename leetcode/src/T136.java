import java.util.Arrays;

public class T136 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        for(int i=0;i<l;i+=2){
            if(i==l-1)
                return nums[i];
            if(nums[i]!=nums[i+1])
                return nums[i];

        }
        return -1;
    }
}
