public class Solution {
    private int[] answer;

    public Solution() {
        answer = new int[2];
    }

    public boolean zip(int[][] arr, int x, int y, int size) {
        int val = arr[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (arr[i][j] != val) {
                    return false;
                }
            }
        }
        return true;
    }

    public void quad(int[][] arr, int x, int y, int size) {
        if (zip(arr, x, y, size)) {
            if (arr[x][y] == 1) {
                answer[1]++;
            } else {
                answer[0]++;
            }
            return;
        }
        int newSize = size / 2;
        quad(arr, x, y, newSize);
        quad(arr, x, y + newSize, newSize);
        quad(arr, x + newSize, y, newSize);
        quad(arr, x + newSize, y + newSize, newSize);
    }

    public int[] solution(int[][] arr) {
        quad(arr, 0, 0, arr.length);
        return answer;
    }
}