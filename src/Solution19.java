public class Solution19 {
    public long solution19(long n) {
        long x = 1;

        // x를 제곱한 값이 n보다 작을 때까지 1씩 키움
        while (x * x < n) {
            x++;
        }

        // x의 제곱이 n과 일치하는지 확인
        if (x * x == n) {
            return (x + 1) * (x + 1);
        } else {
            return -1;
        }
    }
}
