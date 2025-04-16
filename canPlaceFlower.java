class Solution1 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int maxflowers= 0;
        int counter=0;
         if(flowerbed.length==1)
            {
                if(flowerbed[0]==0)
                    maxflowers=1;
                else
                    maxflowers=0;
            }
        else{  
            for(int i=0; i<flowerbed.length; i++){
            
                if(flowerbed[i]==1)
                    counter=0;
                if(flowerbed[i]==0){
                    counter++;   
                    if((i==0||i==flowerbed.length-1) && counter !=3)
                    counter++; 
                }
                if(counter == 3){
                    counter=1;
                    maxflowers++;   
                }     
            }
        }
        if(maxflowers>= n)
            return true;
        return false;    
    }
}