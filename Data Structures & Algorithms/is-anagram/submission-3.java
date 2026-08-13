class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        char[] charArray = s.toCharArray();
        char[] charArray1 = t.toCharArray();
        Arrays.sort(charArray);
        Arrays.sort(charArray1);
        return Arrays.equals(charArray, charArray1);
    }
}
