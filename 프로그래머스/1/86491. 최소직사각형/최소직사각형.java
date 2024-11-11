class Solution {
    public int solution(int[][] sizes) {
        int max_size = 0;  // 가로 길이 중 최대값
        int max_size2 = 0; // 세로 길이 중 최대값

        int sizelen = sizes[0].length; // 명함의 가로와 세로 길이를 나타내는 크기
        int[] newsize = new int[sizes.length]; // 각 명함의 작은 길이를 저장할 배열

        // 가로와 세로 중 큰 값 찾기
        for (int i = 0; i < sizes.length; i++) {
            for (int j = 0; j < sizelen; j++) {
                if (sizes[i][j] >= max_size) {
                    max_size = sizes[i][j];
                }
            }
        }

        // 각 명함의 작은 값을 newsize 배열에 저장
        for (int i = 0; i < sizes.length; i++) {
            int temp = Integer.MAX_VALUE; // 초기값을 큰 값으로 설정
            for (int j = 0; j < sizelen; j++) {
                if (sizes[i][j] <= temp) {
                    temp = sizes[i][j];
                }
            }
            newsize[i] = temp;
        }

        // newsize 배열에서 가장 큰 값을 max_size2에 저장
        for (int i = 0; i < newsize.length; i++) {
            if (newsize[i] >= max_size2) {
                max_size2 = newsize[i];
            }
        }

        return max_size * max_size2;
    }
}