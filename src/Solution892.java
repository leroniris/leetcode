/**
 * 三锥行体的表面积
 * 在N*N的网格上，我们放置一些1*1*1的立方体。
 * 每个值v=grid[i][j]表示v个正方体叠放在对应单元格(i, j)上。
 * 请你返回最终形体的表面积。
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/25 20:31
 */
public class Solution892 {
    public static int surfaceArea(int[][] grid) {
        int sum = 0;
        int N = grid.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int v = grid[i][j];
                if (v > 0) {
                    sum += grid[i][j] * 6 - 2 * (v - 1);
                    sum -= i > 0 ? Math.min(v, grid[i - 1][j]) : 0;
                    sum -= j > 0 ? Math.min(v, grid[i][j - 1]) : 0;
                }
//                int v = grid[i][j];
//                if (v != 0) {
//                    sum += v * 6 - 2 * (v - 1);
//
//                    // 左上角
//                    if (i == 0 && j == 0) {
//                        if ((i + 1) < N && (j + 1) < N) {
//                            sum -= (Math.min(grid[i][j], grid[i][j + 1]) + Math.min(grid[i][j], grid[i + 1][j]));
//                        }
//                    }
//                    // 除去左上角和右上角第一行
//                    else if (j > 0 && j < (N - 1) && i == 0) {
//                        sum -= (Math.min(grid[i][j], grid[i][j + 1]) + Math.min(grid[i][j], grid[i + 1][j]) + Math.min(grid[i][j], grid[i][j - 1]));
//                    }
//                    // 右上角
//                    else if (i == 0 && j == (N - 1)) {
//                        sum -= (Math.min(grid[i][j], grid[i][j - 1]) + Math.min(grid[i][j], grid[i + 1][j]));
//                    }
//                    // 左下角
//                    else if (i == (N - 1) && j == 0) {
//                        sum -= (Math.min(grid[i][j], grid[i][j + 1]) + Math.min(grid[i][j], grid[i - 1][j]));
//                    }
//                    // 除去左上角和左下角
//                    else if (i > 0 && i < (N - 1) && j == 0) {
//                        sum -= (Math.min(grid[i][j], grid[i][j + 1]) + Math.min(grid[i][j], grid[i + 1][j]) + Math.min(grid[i][j], grid[i - 1][j]));
//                    }
//                    // 除去右上角和右下角
//                    else if (j == (N - 1) && i > 0 && i < (N - 1)) {
//                        sum -= (Math.min(grid[i][j], grid[i][j - 1]) + Math.min(grid[i][j], grid[i + 1][j]) + Math.min(grid[i][j], grid[i - 1][j]));
//                    }
//
//                    // 右下角
//                    else if (i == (N - 1) && j == (N - 1)) {
//                        sum -= (Math.min(grid[i][j], grid[i][j - 1]) + Math.min(grid[i][j], grid[i - 1][j]));
//                    }
//                    // 除去右下角和左下角
//                    else if (i == (N - 1) && j > 0 && j < (N - 1)) {
//                        sum -= (Math.min(grid[i][j], grid[i - 1][j]) + Math.min(grid[i][j], grid[i][j - 1]) + Math.min(grid[i][j], grid[i][j + 1]));
//                    }
//                    // 位于中心的
//                    else if (i > 0 && i < (N - 1) && j > 0 && j < (N - 1)) {
//                        sum -= (Math.min(grid[i][j], grid[i - 1][j]) + Math.min(grid[i][j], grid[i + 1][j]) + Math.min(grid[i][j], grid[i][j - 1]) + Math.min(grid[i][j], grid[i][j + 1]));
//                    }
//                }

            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{{1, 2}, {3, 4}};
        System.out.println(surfaceArea(grid));
    }
}
