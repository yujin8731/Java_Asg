package ASG2;
//문제 설명
//        함수의 인자로 양의 정수 n, m, k가 주어진다. 이때, n 이상, m 이하의 정수들중 k의 배수가 몇개있는지 구하시오.
//
//        입출력 예
//        |입력값|결과값|
//        |----|----|
//        |3, 10, 5|2|
//
//        입출력 예 설명
//        3 이상, 10 이하의 수들중 5의 배수의 개수는 2개(5, 10) 이므로 결과값 2
import java.util.Scanner;

public class Ex3 {
    static int solution (int n, int m, int k) {
        int answer = 0;

        for(int i = n; i <= m; i++) {
            if (i % k == 0) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(solution(n,m,k));
    }
}
