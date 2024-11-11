import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[9];
        int totalSum = 0;

        // 아홉 난쟁이의 키를 입력 받고 전체 합을 계산
        for (int i = 0; i < 9; i++) {
            heights[i] = scanner.nextInt();
            totalSum += heights[i];
        }

        // 두 명의 가짜 난쟁이를 찾기
        outerLoop:
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                // 두 난쟁이를 제외한 키의 합이 100인지 확인
                if (totalSum - heights[i] - heights[j] == 100) {
                    // 가짜 난쟁이의 키를 0으로 설정하여 제외
                    heights[i] = 0;
                    heights[j] = 0;
                    break outerLoop;
                }
            }
        }

         // 남은 일곱 난쟁이의 키를 오름차순으로 정렬 후 출력
       Arrays.sort(heights);
	        for (int i = 0; i < heights.length; i++) {
	            if (heights[i] > 0) {
            
	            System.out.println(heights[i]);
					    }
					}
	    }
}
