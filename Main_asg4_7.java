package ASG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
//
//함수의 인자값으로 양의 정수만 들어있는 정수형 배열 arr이 주어진다.
//이때 arr의 요소들의 평균을 구하여 정수형 값으로 리턴하는 함수를 구하세요.
// 평균값이 소수점의 값으로 표현된다면 소수점 값은 버림을 해주세요.

public class Main_asg4_7 {

    static int solution(int[] arr) {
        int answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }

        return (int)answer/arr.length;
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

        System.out.println(solution(arr));
    }
}
