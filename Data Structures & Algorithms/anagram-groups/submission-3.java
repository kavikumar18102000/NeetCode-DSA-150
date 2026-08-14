class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return new ArrayList<>();

        if(strs.length == 1) {

            return List.of(List.of(strs[0]));
        }

        Set<Integer> visitedIndexes = new HashSet<>(strs.length);

        List<List<String>> result = new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {
            if(visitedIndexes.contains(i)){
                continue;
            }

            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);

            List<String> subLis = new ArrayList<>();
            subLis.add(strs[i]);

            for (int j = i + 1; j < strs.length; j++) {
                if(strs[j].length() == chars.length){
                    char[] charArray = strs[j].toCharArray();
                    Arrays.sort(charArray);
                    if(Arrays.equals(chars, charArray)){
                        subLis.add(strs[j]);
                        visitedIndexes.add(j);
                    }
                }
            }

            result.add(subLis);
        }
        return result;
    }
}
