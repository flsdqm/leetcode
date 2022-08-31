public class T605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int num=0,count=1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                count++;
            }else{
                count=0;
            }

            if(count==3){
                num++;
                count=1;
            }
        }

        if(count==2){
            num++;
        }

        return n<=num;
    }
}
