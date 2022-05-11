package ASG2;
//요일 구하기
//        문제 설명
//        오늘은 2007년 1월 1일은 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 함수를 구현하시오
//
//        입력
//
//        첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
//        결과
//
//        첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 리턴한다.
import java.util.Scanner;

public class Ex4 {
    static String solution(int x, int y) {
        String answer = "";
        int totalDay = 0;

        for(int i = 1; i < x; i++) { //월을 더하는 것
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    totalDay += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    totalDay += 30;
                    break;
                case 2:
                    totalDay += 28;
                    break;
            }
        }
        totalDay += y;

        int dayToInt = totalDay % 7; // 일주일이 7일이므로
        if (dayToInt == 0) {
            answer = "SUN";
        } else if (dayToInt == 1) {
            answer = "MON";
        } else if (dayToInt == 2) {
            answer = "TUE";
        } else if (dayToInt == 3) {
            answer = "WED";
        } else if (dayToInt == 4) {
            answer = "THU";
        } else if (dayToInt == 5) {
            answer = "FRI";
        } else if (dayToInt == 6) {
            answer = "SAT";
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(solution(x,y));
    }
}
