public class T231 {
    public boolean isPowerOfTwo(int n) {
        if(n==1)
            return true;
        else{
            while(n%2==0){
                n/=2;
                if(n==1){
                    return true;
                }
                if(n==0){
                    break;
                }
            }
        }
        return false;
    }
}
