import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class letterCombinationsOfAPhoneNumber {
    public List<String> letterCombinations(String digits) {
        HashMap<Integer,String> dict= new HashMap<Integer,String>();
        List<String> res= new ArrayList<String>();
        dict.put(1,"");
        dict.put(2,"abc");
        dict.put(3,"def");
        dict.put(4,"ghi");
        dict.put(5,"jkl");
        dict.put(6,"mno");
        dict.put(7,"pqrs");
        dict.put(8,"tuv");
        dict.put(9,"wxyz");
        for(int i=0 ; i<digits.length();i++){
            int number1= Integer.parseInt(digits.charAt(i)+"");
            int number2=1;
            if(digits.length()>1 && i==0) number2=Integer.parseInt(digits.charAt(i+1)+"");
            if(i==0) res.addAll(combinations(dict.get(number1),dict.get(number2)));
            else
            if(i==1)continue;
            else{
        
                res=combinations(res,dict.get(number1));
            }

        }
        return res;
    }

    public List<String> combinations(String s, String b){
        List<String> res= new ArrayList<String>();
        String elem= "";
        for(char c : s.toCharArray()){
            if(b.length()==0){
                res.add(c+"");
            }
            else{
            for(char c2 : b.toCharArray()){
                elem= elem+c+c2;
                res.add(elem);
                elem="";
            }
            }
        }
        return res;
    }

    public List<String> combinations(List<String> s, String b){
        List<String> res= new ArrayList<String>();
        String elem= "";
        for(String perm : s){
            for(char c2 : b.toCharArray()){
                elem= perm+c2;
                res.add(elem);
                elem="";
            }
        }
        return res;
    }
}
