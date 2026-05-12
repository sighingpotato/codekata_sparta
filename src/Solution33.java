public class Solution33 {
    public int solution33(int left, int right) {
        int answer = 0;

        // left부터 right까지 모든 숫자를 확인
        for (int i = left; i <= right; i++) {
            int count = 0; // 약수의 개수를 저장할 변수

            // 1부터 i까지 나눠 약수의 개수를 구한다.
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++; // 나누어 떨어지면 약수이므로 카운트 증가
                }
            }

            // 약수의 개수가 짝수면 더하고, 홀수면 뺀다.
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}
