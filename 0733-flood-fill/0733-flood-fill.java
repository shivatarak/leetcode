class Solution {
    int[] dx = {-1, 0, 1, 0};
    int[] dy = {0, 1, 0, -1};

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];

        if (oldColor == color) {
            return image;
        }

        dfs(image, sr, sc, oldColor, color);

        return image;
    }

    public void dfs(int[][] image, int row, int col, int oldColor, int color) {
        int m = image.length;
        int n = image[0].length;

        image[row][col] = color;

        for (int i = 0; i < 4; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];

            if (newRow >= 0 && newRow < m &&
                newCol >= 0 && newCol < n &&
                image[newRow][newCol] == oldColor) {

                dfs(image, newRow, newCol, oldColor, color);
            }
        }
    }
}