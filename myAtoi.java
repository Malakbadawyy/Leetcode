public class myAtoi {
    public int myAtoi(String s) {
        String res="";
        boolean isPositive= true;
        boolean isStart= true;
        boolean noIntegersyet= true;
        for(char c : s.toCharArray()){
            if(c==' '&& noIntegersyet)continue;
            if(c=='-'&& isStart){
                isStart=false;
                isPositive=false;
                noIntegersyet=false;

            }else if(c=='+'&&isStart){
                isStart=false;
                isPositive=true;
                noIntegersyet=false;

            }
            else
            if(!(c>= '0' && c<= '9')){
                break;
            }
            else{
                isStart=false;
                noIntegersyet=false;
                res=res+c;
            }  
        }
        if(res=="") return 0;
        long interres = 0;
        try {
            interres = Long.parseLong(res);
        } catch (NumberFormatException e) {
            return isPositive ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
        if (!isPositive) {
            interres *= -1;
        }     
        if(interres > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(interres<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return (int) interres;
        
    }
}
