public class Solution {
    public int[] solution(int brown, int yellow) {
        for (int height = 1; height <= Math.sqrt(yellow); height++) {
            if (yellow % height == 0) {
                int width = yellow / height;

                // (가로 + 2) * (세로 + 2) - yellow가 갈색 격자의 수와 같은지 확인
                if ((width + 2) * (height + 2) - yellow == brown) {
                    return new int[]{width + 2, height + 2};
                }
            }
        }
        return new int[0]; // 조건에 맞는 값이 없을 경우 (문제 조건에 의해 실행되지 않음)
    }
}