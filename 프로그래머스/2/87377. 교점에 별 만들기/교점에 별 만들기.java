import java.util.ArrayList;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

class Solution {

    public static class Point{
        //data => final 키워드 사용 불변성
        private final long x, y;
        //생성자로 초기화
        public Point(long x, long y){
            this.x= x;
            this.y= y;
        }
        public long getX() {
            return x;
        }

        public long getY() {
            return y;
        }

    }

    //교점 구하기
    private Point intersection(long a1, long b1, long c1, long a2, long b2, long c2) {

        long d = (a1 *b2 - a2 *b1);
        if (d==0 ) return null; //평행 or 일치

        double x=(double) (b1 *c2 - b2 *c1) / d ;
        double y= (double) (a2 *c1 - a1 *c2) / d;
        if(x % 1 != 0 || y%1 != 0)
            return null;
        return new Point((long) x , (long) y);
    }



    public String[ ] solution(int[][] line) {
        List<Point> points = new ArrayList<>();

        long minX = Long.MAX_VALUE, minY = Long.MAX_VALUE;
        long maxX = Long.MIN_VALUE, maxY = Long.MIN_VALUE;

        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2],
                        line[j][0], line[j][1], line[j][2]);
                if (intersection != null) {
                    points.add(intersection);
                    minX = Math.min(minX, intersection.getX());
                    minY = Math.min(minY, intersection.getY());
                    maxX = Math.max(maxX, intersection.getX());
                    maxY = Math.max(maxY, intersection.getY());

                }
            }
        }

        int width = (int) (maxX - minX + 1);
        int height = (int) (maxY - minY + 1);
        char[][] arr = new char[height][width];
        for (char[] row : arr) Arrays.fill(row, '.');


        for (Point p : points) {
            int x = (int) (p.getX() - minX);
            int y = (int) (maxY - p.getY());
            arr[y][x] = '*';
        }


        String[] result = new String[height];

        for (int i = 0; i < height; i++) {
            result[i] = new String(arr[i]);
        }
        return result;
    }




}


