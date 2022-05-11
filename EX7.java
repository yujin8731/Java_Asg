package ASG6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EX7 {

    class Solution {
        public int solution(int[] supports) {
            int answer = 0;
            for (int i=0; i<supports.length; i++){
                answer+=supports[i];
            }
            if(answer>100){
                return answer;

            }else if (answer<100){
                answer=100-answer;
            }

            return answer;
        }
    }
}
