package ASG2; //6:21
//각 자리수의 합
//        문제 설명
//        함수의 인자값으로 양의 정수 n이 주어진다. 이때, n의 각 자리수의 합을 구해 리턴하는 함수를 구현하시오.
//
//        입출력 예
//        |입력값|결과값|
//        |----|----|
//        |1945|19|
//
//        입출력 예 설명
//        1945의 각 자리수를 더하면 1+9+4+5 = 19이므로, 결과값은 19

import java.util.Scanner;

public class Ex6 {
    static int solution(int n) {

        int answer = 0;
        while (n != 0) {       //많이 나오는 알고리즘 자리수 구하는 문제 주의깊게 보기
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        System.out.println(solution(n));
    }
}
