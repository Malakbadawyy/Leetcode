import java.util.ArrayList;
import java.util.List;

class FindWordsContainingCharacters {
    /**
     * This method finds the indices of words in the given array that contain a specific character.
     *
     * @param words an array of words to search through
     * @param x the character to look for in the words
     * @return a list of indices of words that contain the character x (may be in any order)
     */
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> result= new ArrayList<Integer>();
        String word;
        for(int i=0;i<words.length;i++){
            word= words[i];
            for(char c : word.toCharArray()){
                if(c==x){
                    result.add(i);
                    break;
                }
            }
        }
        return result;
    }
}