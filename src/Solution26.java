public class Solution26 {
    public int solution26(int[] absolutes, boolean[] signs) {
        int answer = 0;

        // 배열의 길이만큼 반복문 실행
        for (int i = 0; i < absolutes.length; i++) {
            // signs 배열의 값이 true이면 absolutes 배열의 값을 더하고, false이면 빼기
            if (signs[i]) {
                answer += absolutes[i];
            } else {
                answer -= absolutes[i];
            }
        }
        // 최종 합계 반환
        return answer;
    }
}
