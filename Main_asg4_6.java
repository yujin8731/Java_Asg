package ASG4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


//함수의 인자값으로 양의 정수 n이 주어진다. 이때, 1부터 9까지의 구구단을 구하여 배열의 형태로 리턴하는 함수를 구현하시오.



public class Main_asg4_6 {

    static int[] solution(int n) {
        int[] answer = new int[9];
        for (int i = 1; i <= 9; i++) {
            answer[i-1] = n * i;
        }

        return answer;
    }

    static String toString(int[] arr) {
        String answer = "";

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i] + " ";
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(toString(solution(n)));
    }
}
