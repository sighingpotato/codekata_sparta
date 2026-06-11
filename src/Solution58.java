public class Solution58 {
  public int solution58(int[] nums) {
    int answer = 0;
        int len = nums.length;

        // 1. 서로 다른 숫자 3개를 고르는 삼중 반복문
        for (int i = 0; i < len - 2; i++) {
            for (int j = i + 1; j < len - 1; j++) {
                for (int k = j + 1; k < len; k++) {

                    // 2. 세 숫자의 합을 구합니다.
                    int sum = nums[i] + nums[j] + nums[k];

                    // 3. 합이 소수라면 정답 카운트를 증가시킨다.
                    if (isPrime(sum)) {
                        answer++;
                    }
                }
            }
        }

        return answer;
    }

    // 4. 소수인지 판별하는 함수 (Helper Method)
    private boolean isPrime(int num) {
        // 2보다 작은 수는 소수가 아닙니다.
        if (num < 2) return false;

        // 2부터 해당 숫자의 제곱근(√num)까지 나누어 떨어지는지 확인.
        // i * i <= num 은 i <= Math.sqrt(num) 과 같은 의미이며 속도가 더 빠르다.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // 하나라도 나누어 떨어지면 소수가 아님
            }
        }

        return true; // 끝까지 안 나누어 떨어지면 소수
    }
}
