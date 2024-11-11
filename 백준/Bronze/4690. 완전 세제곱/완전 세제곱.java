public class Main{
    public static void main(String[] args) {
        // a의 범위는 2부터 100까지
        for (int a = 2; a <= 100; a++) {
            int aCube = a * a * a;  // a^3을 미리 계산하여 중복 연산을 줄임

            // b, c, d의 조합을 찾기
            for (int b = 2; b <= a; b++) {
                int bCube = b * b * b;

                for (int c = b+1; c <= a; c++) {
                    int cCube = c * c * c;

                    for (int d = c+1; d <= a; d++) {
                        int dCube = d * d * d;

                        // a^3 = b^3 + c^3 + d^3 인지 확인
                        if (aCube == bCube + cCube + dCube) {
                            // 조건을 만족하는 경우 출력
                            System.out.printf("Cube = %d, Triple = (%d,%d,%d)%n", a, b, c, d);
                        }
                    }
                }
            }
        }
    }
}
