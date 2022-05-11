package ASG4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


//백설공주의 집에 일곱 난쟁이가 아닌 여덟 난쟁이가 있다.
//        키가 100 이상인 한명의 가짜 난쟁이가 이 안에 숨어 있다고 할때, 가짜 난쟁이의 번호를 리턴하는 함수를 구현하시오.
//
//        예를 들어 난쟁이의 키가 배열 arr 로 주어지고, 그 값이 [20, 15, 60, 70, 50, 90, 110, 80]이라고 하자.
//        그렇다면 키가 100이 넘는 난쟁이의 번호(index 값)는 6이므로 6을 리턴하면 된다.
public class Main_asg4_10 {

    static int solution(int[] arr) {

        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 100) {
                answer = i;
            }
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

        System.out.println(solution(arr));
    }
}
