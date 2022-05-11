package ASG2;

//고된 코딩
//        문제 설명
//        홍규는 코딩이 너무 힘들어서 코딩을 한다면 1시간 40분마다 커피 한잔을 마셔야 한다.
//        앞으로 코딩을 해야 하는 시간이 주어지면 홍규에게 필요한 커피의 개수를 구하여라.
//
//        홍규는 일을 시작하기에 앞서 커피를 한잔 마시고 시작한다.
//
//        입출력 제한
//
//        입력값은 h, m 단위로 나누어져 주어진다.
//        h, m은 int형으로 주어진다.
//        마셔야 하는 커피의 개수를 int형으로 리턴한다.
//        입출력 예시
//
//        입력값	출력값
//        20, 36	13
//        0, 50	1

import java.util.Scanner;

public class Ex9 {
    static int solution (int h, int m) {

        int answer = 1;
        int total = h * 60 + m;
        answer += total / 100;
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();




        System.out.println(solution(h,m));
    }
}
