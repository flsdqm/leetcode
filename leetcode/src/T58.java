public class T58 {
    public int lengthOfLastWord(String s) {
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) != ' '){
                ans++;
            }else if(ans != 0){//是空格并且已经读取到单词长度，直接返回
                break;
            }
        }
        return ans;
    }
}
