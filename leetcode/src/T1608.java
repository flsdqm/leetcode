public class T1608 {
    public int specialArray(int[] nums) {
        int l = nums.length;
        for(int i=0; i<=l; i++){
            int count=0;
            for(int j=0;j<l;j++){
                if(nums[j]>=i)
                    count++;
            }
            if(count==i)
                return i;
        }
        return -1;
    }
}
