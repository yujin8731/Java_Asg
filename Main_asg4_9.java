package ASG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//
//함수의 인자값으로 양의 정수가 들어있는 1차원 배열 arr이 주어진다.
//        arr의 값중 0~9의 수가 각각 몇개씩 쓰였는지 배열에 담아 리턴하는 함수를 구현하시오.
//        결과배열은 10개의 사이즈를 가지며, 0번 인덱스부터 차례대로 0~9의 숫자 카운트 값을 가집니다.

public class Main_asg4_9 {

    static int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            answer[arr[i]]++;
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
        StringTokenizer st = new StringTokenizer(br.readLine(), "[,]");

        int size = st.countTokens();
        int[] arr = new int[size];
        int index = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            arr[index++] = num;
        }

        System.out.println(toString(solution(arr)));
    }
}
