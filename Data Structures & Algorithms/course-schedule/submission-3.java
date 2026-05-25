class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        List<List<Integer>> adj = new ArrayList<>();

        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }

        for(int[] pre: prerequisites){
            indegree[pre[1]]++;
            adj.get(pre[0]).add(pre[1]);
        }

        Queue<Integer> que = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                que.add(i);
            }
        }

        int finish=0;
        while(!que.isEmpty()){
            int node = que.poll();
            finish++;
            for(int neigh: adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    que.add(neigh);
                }
            }
        }
        return finish == numCourses;
    }
}
