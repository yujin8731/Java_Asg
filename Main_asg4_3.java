package ASG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//함수의 인자 값으로 양의 정수 n과, 정수형 배열 arr을 받는다
//        arr에는 1에서 n까지의 수가 들어있으며, 단 하나의 수만 한개가 들어있다.
//        이때 arr 배열에 하나만 들어있는 숫자를 찾아 리턴하는 함수를 구현하시오.

public class Main_asg4_3 {//15:10
    static int solution(int n, int[] arr) {
        int cnt[] = new int[n];
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            cnt[arr[i]-1]++;//9 [2 3 4 5 2 4 5 6 4]
        }

        for (int i = 0; i < cnt.length; i++) {
            if (cnt[i] == 1) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        String arrString = st.nextToken();
        st = new StringTokenizer(arrString, "[,]");
        int size = st.countTokens();
        int[] arr = new int[size];
        int index = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            arr[index++] = num;
        }

        System.out.println(solution(n, arr));
    }


}
