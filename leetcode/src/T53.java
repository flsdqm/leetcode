public class T53 {
    public int maxSubArray(int[] nums) {
        int a=nums[0],ans=nums[0];
        for (int i=1;i<nums.length;i++) {
            a=Math.max(a+nums[i],nums[i]);//先比较加下一项之后是小是大
            ans=Math.max(ans,a);//再比较是大是否比目前最大大，之前最大可能已经加了后面的减小项
        }
        return ans;
    }
}
