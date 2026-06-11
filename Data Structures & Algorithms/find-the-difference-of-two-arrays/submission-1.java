class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num: nums1) set1.add(num);
        for(int num: nums2) set2.add(num);

        List<Integer> res1 = new ArrayList<>(set1);
        res1.removeAll(set2);
        List<Integer> res2 = new ArrayList<>(set2);
        res2.removeAll(set1);

        return Arrays.asList(res1, res2);

    }
}