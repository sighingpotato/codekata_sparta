import java.util.ArrayList;
import java.util.List;

public class Solution17 {
    public int[] solution(long n) {
        // 각 자리 숫자를 담을 리스트 생성
        List<Integer> list = new ArrayList<>();

        // n이 0이 될 때 까지 반복
        while (n > 0) {
            list.add((int)(n % 10)); // 일의 자리 숫자를 리스트에 추가
            n = n / 10; // 일의 자리 제거
        }

        // List -> int[] 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i); // List의 각 요소를 배열에 복사
        }
        return answer;
    }
}
