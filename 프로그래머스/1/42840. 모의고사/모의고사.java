import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution {
    public int[] solution(int[] answers) {

        //1,2,3,4,5,,,  5개
        //2,1,2,3,2,4,2,5,,, 8개
        //3,3,1,1,2,2,4,4,5,5,,,, 10개

        int [][] arr = {{1,2,3,4,5},
                {2,1,2,3,2,4,2,5},
                {3,3,1,1,2,2,4,4,5,5}};

        int[] score = {0,0,0};


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (arr[i][j% arr[i].length] == answers[j]) {
                    score[i]++;
                }
            }
        }

        int max = Math.max(score[0], Math.max(score[1], score[2]));


        List<Integer> answ = new ArrayList<Integer>();
        for(int i=0; i<score.length; i++) if(max == score[i]) answ.add(i+1);

        int[] answer = new int[answ.size()];
        for(int i=0; i<answ.size(); i++){
            answer[i] = answ.get(i);
        }

        return answer;
    }

}