public class T69 {
    public int mySqrt(int x) {
        int left = 1; int right = x;
        while (left < right)
        {
            int mid = left + (right - left) / 2;
            if (mid < x / (mid*1.0))
                left = mid + 1;
            else
                right = mid;
        }
        return left == x / left ? left : left - 1;
    }
}
