
public class EX10 {

    static public int solution(int[] books) {
        int answer = 0; //7,4=11이니까 안됨
        int sum=0;
        for (int i=0;i<books.length;i++){//디버그여기찍어
            sum+=books[i];
            if(sum>10){
                answer += 10 - (sum - books[i]);//만약 7,4 11이라고 치면 3을 구해야 하니까 10-(11-4)
                sum = books[i];
            }
        }
        if (sum != 10) {
            answer += 10 - sum;
        }


        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {7, 4, 5, 3}; // 다른 결과 보려면 여기 배일 부분 수정하면 됨

        System.out.println(solution(arr));
    }

}