package ASG2;


//각도와 사분면
//        문제 설명
//        아래 그림과 같이 좌표평면에 각도가 주어진다.
//
//        그림1.png
//
//        각이 어느 사분면에 위치해있는지를 구하여라.
//
//        우상단이 제1사분면,
//        좌상단이 제2사분면,
//        좌하단이 제3사분면,
//        우하단이 제4사분면이다.
//
//        입출력 제한
//
//        각도는 0이상 9,000,000 이하인 정수이다.
//        각도가 위치한 사분면을 리턴한다.("제1사분면", "제2사분면", "제3사분면", "제4사분면")
//        각도가 좌표축에 위치할 경우 "좌표축"을 리턴한다.
//        입출력 예시
//
//        입력값	출력값
//        90	"좌표축"
//        193	"제3사분면"
//        271	"제4사분면"
//        13	"제1사분면"
//        105	"제2사분면"


import java.util.Scanner;

public class Ex10 {
    static String solution(int theta) {
        String answer = "";

        int pivot = theta % 360;
        if (theta % 90 == 0) {
            answer = "좌표축";
        } else if (pivot < 90) {   //360 나누기 90이 아닌가?,,,
            answer = "제1사분면";
        }  else if (pivot < 180) {
            answer = "제2사분면";
        }  else if (pivot < 270) {
            answer = "제3사분면";
        }  else if (pivot < 360) {
            answer = "제4사분면";
        }

        return answer;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int theta = sc.nextInt();




        System.out.println(solution(theta));
    }
}
