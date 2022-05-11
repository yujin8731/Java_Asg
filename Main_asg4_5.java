package ASG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//함수의 인자로 정수형 배열 arr이 주어진다. 이때, 배열의 값을 뒤집어 저장하는 함수를 작성하시오.
public class Main_asg4_5 {

    static int[] solution(int[] arr) {
        int size = arr.length;
        int[] answer = new int[size];
        for (int i = size - 1; i >=0; i--) {
            answer[i] = arr[size - i - 1];
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
