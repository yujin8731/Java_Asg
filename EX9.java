package ASG6;

public class EX9 {

    class Solution {
        public int solution(int n) {
            int answer = 1;
            int cnt[]=new int[10];



            while(n!=0){
                cnt[n%10]++;
                n/=10;
            }

            for(int i=0;i<cnt.length;i++){
                if(cnt[i]>answer){
                    answer=cnt[i];
                }
            }


            return answer;
        }
    }

}
