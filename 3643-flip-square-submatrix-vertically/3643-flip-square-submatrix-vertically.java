class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int n = grid.length;
        int m = grid[0].length;
        int i = x;
        int z = y;
        int j = x + k - 1;
        while (i < j) {
            z = y;
            while (z < y + k) {
                int temp = grid[i][z];
                grid[i][z] = grid[j][z];
                grid[j][z] = temp;
                z++;
            }
            i++;
            j--;
        }
        return grid;
    }
}