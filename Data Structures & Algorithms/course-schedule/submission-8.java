class Solution {
    Map<Integer,List<Integer>> premap = new HashMap<>();
    Set<Integer> visited = new HashSet<>();
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        for(int i=0;i<numCourses;i++){
            premap.put(i, new ArrayList<>());
        }

        for(int i=0;i<prerequisites.length;i++){
            premap.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for(int i=0;i<numCourses;i++){
            if(!dfs(i)) return false;
        }
        return true;
    }
    private boolean dfs(int course){
        if(visited.contains(course))return false;
        if(premap.get(course).isEmpty()) return true;

        visited.add(course);
        for(int prereq : premap.get(course)){
            if(!dfs(prereq)) return false;
        }
        visited.remove(course);
        premap.put(course,new ArrayList<>());
        return true;
    }
}
