class Solution {       
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int a[2]={0,1};
        f(a,nums,target);
        if(nums[a[0]]+nums[a[1]]!=target)
            return {};
        return {a[0],a[1]};
};
void f(int a[],vector<int>& nums, int target){
        if(a[1]==nums.size()-1){
            if(a[0]==nums.size()-2)
                return ;
            if(nums[a[0]]+nums[a[1]]==target){
                return ;
            }
            a[1]=a[0]+2;
            a[0]++;
            return f(a,nums,target);
        }
        if(nums[a[0]]+nums[a[1]]==target){
            return ;
        }
        else{
            a[1]++;
            return f(a,nums,target);
        }
    }
};
