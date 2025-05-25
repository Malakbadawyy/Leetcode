import java.util.ArrayList;

public class ZigzagConversion {
        public String convert(String s, int numRows) {
    ArrayList<ArrayList<Character>> patterncreator = new ArrayList<ArrayList<Character>>();
    if(numRows == 1) return s;

    int i=0;
    int j=0;
    patterncreator.add(new ArrayList<Character>());
    char c;
    int chr=0;
    char[] list=s.toCharArray();
    int diag=numRows-1;
    

    while(chr<list.length){
        c = list[chr];
        if(j == numRows){
            patterncreator.add(new ArrayList<Character>());
            j=0;
            i++;
            diag--;
            if(diag==0){
                diag=numRows-1;
            }
   
        }
        else if((j==diag) || ((i % (numRows-1)) == 0)){
            patterncreator.get(i).add(c);
            chr++;
            j++;
    
        }
        else{
            patterncreator.get(i).add('*');
            j++;
        }
      } 
      while(j<numRows){
          patterncreator.get(i).add('*');
            j++;
      }

    StringBuilder sb = new StringBuilder("");

    char currentchar;
      for(int l =0 ; l<numRows; l++){
        for(int k=0; k< patterncreator.size();k++){
            currentchar= patterncreator.get(k).get(l);
            if( currentchar != '*'){
                sb.append(currentchar);
            }
        }
      } 



    return sb.toString();
    }
}
