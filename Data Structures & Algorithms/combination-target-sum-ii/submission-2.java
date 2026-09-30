class Solution {
    private List<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(candidates, target, 0, new ArrayList<>(), 0);
        return res;
    }

    public void dfs(int[] candidates, int target, int index, List<Integer> curr, int total){
        if(target==total){
            res.add(new ArrayList<>(curr));
            return;
        }

        if(total > target || index==candidates.length){
            return;
        }
        curr.add(candidates[index]);
        dfs(candidates, target, index+1, curr, total + candidates[index]);
        curr.remove(curr.size()-1);
        while (index + 1 < candidates.length && candidates[index] == candidates[index + 1]) {
            index++;
        }
        dfs(candidates, target, index+1, curr, total);

    }
}
