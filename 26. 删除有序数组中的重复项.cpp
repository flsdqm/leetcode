class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        int j=0,x=1;
        if(nums.size()<2)
            return nums.size();
        for(int i=0;i<nums.size()-1;i++){
            if(nums[i]==nums[i+1])
                j++;
            else{
                nums[i+1-j] = nums[i+1];
                x++;
            }
        }
        return x;
    }
};
