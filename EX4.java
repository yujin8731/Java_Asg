package ASG6;

import java.io.IOException;

public class EX4 {

    class Solution {
        public int solution(int[] scores) {
            int answer = 0;
            int first=0;
            int second=0;

            for(int i=0;i<scores.length;i++){
                if(scores[i]>first){
                    second=first; //seond에 0을 넣어줌
                    first=scores[i];
                }else if(scores[i]>second){ //두번째 돌았을때 0보다 크고 fist보다 작으면 second에 넣어주고
                    second=scores[i];

                }
                answer=first-second;
            }



            return answer;
        }
    }
}