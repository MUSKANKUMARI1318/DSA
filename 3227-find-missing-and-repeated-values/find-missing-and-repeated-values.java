class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        HashSet<Integer>Set=new HashSet<>();

        int repeated = -1;
        int missing = -1;

        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(Set.contains(grid[i][j])){
                    repeated = grid[i][j];

                }
                Set.add(grid[i][j]);

           
            }
        }

        for(int num = 1;num<=n*n;num++){
            if(!Set.contains(num)){
                missing=num;
                break;

            }
        }

        return new int[]
            {repeated,missing};
        

    }
}