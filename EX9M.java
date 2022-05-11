package ASG6;

public class EX9M {
    class Solution {
        public int solution(int n) {
            int answer = 1;
            int cnt[]=new int[10];
            //똑같은 숫자가 있으면 1개 번호판 세트 더 필요.//내 아이디어는 배열을 만들어서 하고 싶은데...

            while (n!=0){
                cnt[n%10]++;
                n /= 10;
            }


            //가장 큰수 리턴
            for (int i=0;i<cnt.length;i++){
                if(answer<cnt[i]){
                    answer=cnt[i];
                }
            }
            return answer;
        }
    }



}
