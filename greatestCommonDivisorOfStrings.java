class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        // Euclidean algorithm
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }



    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "ABCABC";
        String str2 = "ABC";
        System.out.println(sol.gcdOfStrings(str1, str2)); // Output: "ABC"
    }
}