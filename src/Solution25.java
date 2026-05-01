import java.util.ArrayList;
import java.util.Collections;

public class Solution25 {
    public int[] solution25(int[] arr, int divisor) {
        // ArrayList 생성
        ArrayList<Integer> list = new ArrayList<>();

        // 배열을 순회하며 divisor로 나누어 떨어지는지 검사
        for (int num : arr) {
            if (num % divisor == 0) {
                list.add(num); // 나누어 떨어지는 수를 리스트에 추가
            }
        }

        // 나누어 떨어지는 수가 없으면 -1을 담은 배열 반환
        if (list.isEmpty()) {
            return new int[]{-1};
        }

        // 오름차순으로 정렬
        Collections.sort(list);

        // ArrayList를 int[] 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
