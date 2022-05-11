package ASG6;

import java.io.IOException;

public class EX8 {

    class Solution {
        public int solution(int[] input) {
            int cnt = 0;

            for (int i=0; i<input.length;i++){
                if (cnt >= 3) {
                    return 0;
                }
                if (input[i]==0){
                    cnt++;
                }else if(input[i]==1){
                    cnt = 0;
                }
            }

            return 1;
        }
    }
}
