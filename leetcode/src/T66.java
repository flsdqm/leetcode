public class T66 {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        if(digits[i]!=9) {
            digits[i]+=1;
            return digits;
        } else {
            digits[i]=0;
            i=i-1;
            if(i==-1){
                int[] m = new int[digits.length+1];
                m[0]=1;
                return m;
            }
            digits[i]+=1;
            while(digits[i]==10){
                digits[i]=0;
                i=i-1;
                if(i==-1){
                    int[] m = new int[digits.length+1];
                    m[0]=1;
                    return m;
                }
                digits[i]+=1;
            }
            return digits;
        }
    }
}
