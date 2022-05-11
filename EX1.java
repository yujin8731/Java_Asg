package ASG6;

public class EX1 {
    class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int sum=0;
            int ave=0;

            for(int i=0; i<arr.length;i++){
                sum+=arr[i];
            }
            ave=sum/arr.length;

            for(int i=0; i<arr.length;i++){
                if(ave>arr[i]){
                    answer++;
                }
            }

            return answer;
        }
    }


}
