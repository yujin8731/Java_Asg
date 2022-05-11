package ASG2;
//문제 설명
//        함수의 인자로 삼각형 세 변의 길이가 주어진다. 인자는 항상 양수이며, x > y,z를 항상 만족한다고 한다.
//
//        이때 주어진 삼각형이 예각삼각형이면 1을, 직각삼각형이면 2를 둔각삼각형이면 3을 리턴하는 함수를 작성하시오.
//
//        입출력 예
//        |입력값|결과값|
//        |----|----|
//        |3,3,3|3|
//        |5,4,3|2|
//
//        입출력 예 설명
//        문제 1.
//        32 < 32 + 32 이므로 예각삼각형이다. 고로 1 리턴
//
//        문제 2. 52 == 42 + 32 이므로 직각삼각형이다. 고로 2 리턴
import java.util.Scanner;

public class Ex1 {
    static int solution(int x, int y, int z) {
        int answer =0;
        if (x*x< y*y+ z*z){
            answer = 1;
        }
        else if (x*x == y*y+ z*z) {
            answer = 2;
        } else {
            answer = 3;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println(solution(x,y,z));
    }
}
