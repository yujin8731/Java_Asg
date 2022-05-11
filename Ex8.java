package ASG2;
//정다면체 구별
//        문제 설명
//        어떤 정다면체의 면, 변, 꼭짓점의 개수가 주어지면, 어떤 정다면체인지를 리턴한다.
//        만약 정다면체가 이루어지는 조건이 주어지지 않는다면 "False"를 리턴한다.
//
//        입출력 제한
//
//        면의 개수는 face 변수에 주어진다.
//        변의 개수는 side 변수에 주어진다.
//        꼭짓점의 개수는 apex 변수에 주어진다.
//        출력 값은 "정사면체", "정육면체", "정팔면체", "정십이면체", "정이십면체", "False"로 한다.
//        입출력 예시
import java.util.Scanner;

public class Ex8 {
    static String solution (int face, int side, int apex) {
        String answer = "";
        if (face == 4 && side == 6 && apex == 4) {
            answer = "정사면체";
        } else if (face == 6 && side == 12 && apex == 8) {
            answer = "정육면체";
        } else if (face == 8 && side == 12 && apex == 6) {
            answer = "정팔면체";
        } else if (face == 12 && side == 30 && apex == 20) {
            answer = "정십이면체";
        } else if (face == 20 && side == 30 && apex == 12) {
            answer = "정이십면체";
        } else {
            answer = "False";
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int face = sc.nextInt();
        int side = sc.nextInt();
        int apex = sc.nextInt();




        System.out.println(solution(face,side,apex));
    }
}
