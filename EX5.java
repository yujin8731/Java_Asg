package ASG6;

import java.io.IOException;

public class EX5 {

    class Solution {
        public int[] solution(int[] scores) {
            int[] answer = new int[scores.length+1];

            for(int i=0;i<scores.length;i++){
                if(scores[i]<50){
                    answer[i]=scores[i]+20; //score를 도는건데 score보다 길이가 크면 안되겠지
                    answer[scores.length]++;//20플러스 하면 동시에 마지막 배열에 1을 추가해야함

                }else{
                    answer[i]=scores[i];
                }
            }

            return answer;
        }
    }
}