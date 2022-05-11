import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//함수의 인자로 정수형 1차원 배열 arr이 주어진다. 이때, 배열의 모든 요소를 곱해 리턴하는 함수를 작성하시오.

public class Main_asg4_4 {
    static int solution(int[] arr) {
        int answer = 1;
        for (int i = 0; i < arr.length; i++) {
            answer *= arr[i];
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

        System.out.println(solution(arr));
    }


    }