class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> list = new HashMap<>();

        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newkey = new String(arr);
            list.computeIfAbsent(newkey, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(list.values());
    }
}
