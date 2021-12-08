/**
 * 车的可用捕获量
 *
 * @author Leron
 * @version 1.0.0
 * @create 2020/3/26 23:09
 */
public class Solution999 {
    public int numRookCaptures(char[][] board) {

        int dx[] = {0, 1, 0, -1};
        int dy[] = {1, 0, -1, 0};

        int rx = 0;
        int ry = 0;
        int sum = 0;
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                if(board[i][j] == 'R') {
                    rx = i;
                    ry = j;
                    break;
                }
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int step = 1; ; step++) {
                int tx = rx + step * dx[i];
                int ty = ry + step * dx[i];
                if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B'){
                    break;
                }
                if(board[tx][ty] == 'p') {
                    sum++;
                    break;
                }
            }
        }

        return sum;
    }
}
