package ASG2;
//문제 설명
//        함수의 인자값으로 양의 정수 n이 주어진다. 이때, 1부터 n 이하의 수들 중 홀수의 개수를 리턴하는 함수를 구현하시오.
//
//        입출력 예
//        |입력값|결과값|
//        |----|----|
//        |14|7|
//
//        입출력 예 설명
//        14이하의 수들중 홀수의 개수는 총 7개(1, 3, 5, 7, 9, 11, 13) 이므로 결과값은 7
import java.util.Scanner;

public class Ex2 {
    static int solution(int n) {
        int answer = 0;
        if (n%2==0) {
            answer= n/2;
        }

        else if (n%2==1) {
            answer= (n+1)/2;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(solution(n));
    }
}
