import java.util.Arrays;

public class T349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] intersection = new int[length1 + length2];
        int index = 0, index1 = 0, index2 = 0;
        while(index1<length1&&index2<length2){
            int num1 = nums1[index1], num2 = nums2[index2];
            if (num1 == num2) {
                //防止重复
                if (index == 0||num1 != intersection[index - 1]) {
                    intersection[index++] = num1;
                }
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }
        //返回intersection数组的0~index位，因为没有全部填入数据，除非两个数组内容完全不重复。
        return Arrays.copyOfRange(intersection, 0, index);
    }
}
