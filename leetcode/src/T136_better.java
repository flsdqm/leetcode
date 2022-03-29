public class T136_better {
    public int singleNumber(int[] nums) {
        int single = 0;
        for (int num : nums) {
            single ^= num;//一个数与0异或是本身，本身再与本身异或就是0，异或满足交换率，所以最后剩的是它本身的数即是单个的数
        }
        return single;
    }
}
