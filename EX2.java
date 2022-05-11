package ASG6;

public class EX2 {


    class Solution {
        public int solution(int[] arr) {
            int answer = 0;
            int sum=1;
            for(int i=0; i<arr.length;i++){
                sum*=arr[i];
            }
            while(sum!=0){
                if(sum%10==0){
                    answer++;
                    sum/=10;
                }

                else {
                    break;
                }

            }
            return answer;
        }
    }


}
