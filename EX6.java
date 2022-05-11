package ASG6;

public class EX6 {

    class Solution {
        public int solution(int[] scores, int myScore) {
            int answer = 1;

            for(int i=0;i<scores.length;i++){
                if(myScore<scores[i]){  //이러면 중복도 해결됨
                    answer++;
                }

            }

            return answer;
        }
    }
}