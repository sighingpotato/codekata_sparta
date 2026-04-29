public class Solution22 {
    public long solution22(int a, int b) {
        long answer = 0;

        // a와 b 중 작은 수와 큰 수 판별
        int start = Math.min(a, b);
        int end = Math.max(a, b);

        // 작은 수부터 큰 수까지 다 더하기
        for (int i = start; i <= end; i++) {
            answer = answer + i;
        }
        return answer;
    }
}