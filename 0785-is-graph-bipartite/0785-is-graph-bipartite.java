class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        int color[]=new int[graph.length];
        Arrays.fill(color,-1);
        for(int i=0;i<graph.length;i++){
            if(color[i]!=-1){
                continue;
            }
            q.add(i);
            color[i]=0;
        while(!q.isEmpty()){
            int node=q.poll();
            for(int nbrs:graph[node]){
                if(color[nbrs]==-1){
                    if(color[node]==0){
                        color[nbrs]=1;
                    }
                    else{
                        color[nbrs]=0;
                    }
                    q.add(nbrs);
                }
                else if(color[nbrs]==color[node]){
                    return false;
                }
            }
        }
        }
        return true;
    }
}