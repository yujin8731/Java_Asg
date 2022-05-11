package ASG5;

import java.io.IOException;
import java.util.*;

public class ex11 {

    static int solution(int[] order) {
        int answer = 0;
        boolean[] reserve = new boolean[1001];

        for (int i = 0; i < order.length; i++) {
            if (reserve [i]) {
                answer++;
            } else {
                reserve[i] = true;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        int[] order = {
                10, 20, 30, 20, 10
        };
        System.out.println(solution(order));
    }
}