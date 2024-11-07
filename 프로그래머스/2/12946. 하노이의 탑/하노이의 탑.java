import java.util.ArrayList;
import java.util.List;

public class Solution {
    // 재귀적으로 이동 경로를 기록하는 하노이 메서드
    public void hanoi(int n, int start, int dest, int waypoint, List<int[]> moves) {
        // 기본 조건: 원판이 1개일 경우
        if (n == 1) {
            moves.add(new int[] {start, dest});  // 이동 경로 기록
        } else {
            // 1. n-1개의 원판을 start에서 waypoint로 이동
            hanoi(n - 1, start, waypoint, dest, moves);
            
            // 2. 가장 큰 원판을 start에서 dest로 이동
            moves.add(new int[] {start, dest});
            
            // 3. n-1개의 원판을 waypoint에서 dest로 이동
            hanoi(n - 1, waypoint, dest, start, moves);
        }
    }

    // 하노이 탑 문제의 전체 이동 경로를 반환하는 solution 메서드
    public int[][] solution(int n) {
        List<int[]> moves = new ArrayList<>();  // 이동 경로를 저장할 리스트
        hanoi(n, 1, 3, 2, moves);  // 1번 기둥에서 3번 기둥으로 이동

        // List를 2차원 배열로 변환하여 반환
        return moves.toArray(new int[0][]);
    }
}