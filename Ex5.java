package ASG2;
//제곱수의 합
//        문제 설명
//        함수의 인자값으로 양의 정수 n이 주어진다. 이때, 2이상 n이하의 자연수들중 완전제곱수(ex. 4, 9, 16, 25... 등) 들의 합을 구해 리턴하는 함수를 구현하시오.
//
//        입출력 예
//        |입력값|결과값|
//        |-----|----|
//        |10|13|
//
//        예제 설명
//        2 이상 10 이하의 수들중 완전 제곱수는 4, 9이고, 이들의 합은 13이다. 고로 결과값은 13
import java.util.Scanner;

public class Ex5 {
    static int solution(int n) {
        int answer = 0;

        int max = (int) Math.sqrt(n); //Math.sqrt제곱근 구하는 함수, math.sqrt가 실수가 나오는데 이걸 int로 바꿔져야 해서 강제 타입벼놘
        for (int i = 2; i <= max; i++) {
            answer += i*i;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        System.out.println(solution(n));
    }
}
