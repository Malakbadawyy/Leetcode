public class isAnagram {
       public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        char[] schar = s.toCharArray();
        Arrays.sort(schar);
        char[] tchar = t.toCharArray();
        Arrays.sort(tchar);
        int index = 0;
        while (index < schar.length) {
            if (schar[index] != tchar[index])
                return false;
            index++;
        }
        return true;

    }
}
