package ASG6;


public class EX3 {

    class Solution {
        public int solution(String[] menu) {
            int answer = 0;
            for(int i=0;i<menu.length;i++) {  //string 배열 개수 세는 법 물어보기
                //가지가 들어갔을때 매운도 같이 있으면 괜찮다
                //매운맛 있으면 됨

                if (!menu[i].contains("가지") || menu[i].contains("매운")){
                    answer++;
                }
            }
            return answer;
        }
    }
}