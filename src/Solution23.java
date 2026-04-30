public class Solution23 {
    public int solution23(int num) {
        long n = num;
        int count = 0; // 작업 횟수

        // n이 1이 될 때까지 반복
        while(n != 1) {
            // 500번을 반복해도 1이 되지 않으면 -1 반환
            if (count == 500) {
                return -1;
            }

            // 짝수, 홀수 조건에 맞춰 계산
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            count++;
        }
        return count;
    }
}
