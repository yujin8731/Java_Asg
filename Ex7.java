package ASG2;

//입력한 정수보다 같거나 작을때 까지 더하기
//        문제 설명
//        문제 설명
//
//        1, 2, 3 ... 을 계속 더해나갈때, 그 합이 입력한 정수보다 클때까지 계속 합하는 프로그램을 작성해보자.
//        즉, 1부터 n까지 정수를 계속 합해 간다고 할 때, 어디까지 합해야 주어진 값보다 더 커지는지 알아보고자하는 문제이고, 그 때의 합을 출력해야 한다.
//        예를 들어 57을 입력하면 1+2+3+...+8+9+10=55 에 다시 11을 더해 66일 때 66이 출력되어야 한다.
//        입력
//
//        어느 정도까지 합을 계산할 지, 정수 limit를 입력 받는다.
//        출력
//
//        1, 2, 3, 4 ... 와 같이 계속 더해가다가, 입력된 정수보다 커질때까지, 그 때 까지의 합을 출력한다.

import java.util.Scanner;

public class Ex7 {
    static int solution(int limit) {
        int answer = 0;
        for (int i = 1; i <= limit; i++) {
            answer += i;
            if (answer > limit) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();



        System.out.println(solution(n));
    }
}
