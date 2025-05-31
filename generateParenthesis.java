import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
        public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(n,n,"",result);
        return result;
        
    }

    public void generate(int o, int c, String curr, List<String>res){
        if(o==0 && c ==0){
            res.add(curr);
            return;
        }
        if(o>0) 
            generate(o-1, c, curr+"(", res);
        if(o<c)
            generate(o, c-1, curr+")", res); 
              

    }
}
