import java.util.Arrays;

public class Solution56 {
    public int solution56(int k, int m, int[] score) {
        int answer = 0;

        // 1. 사과 점수를 오름차순으로 정렬한다.
        Arrays.sort(score);

        // 2. 뒤에서부터 m개씩 묶어서 상자를 만든다.
        // i는 각 상자에서 가장 낮은 점수를 가진 사과의 인덱스가 된다.
        // score.length - m 부터 시작해서 m씩 뒤로 점프
        for (int i = score.length - m; i >= 0; i -= m) {
            // 3. (최저 점수 * 상자당 사과 수)를 더한다.
            answer += score[i] * m;
        }

        return answer;
    }
}
