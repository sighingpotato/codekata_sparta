public class Solution39 {
    public int[] solution39(int n, int m) {
        int gcd = 1; // 최대공약수를 담을 변수

        // 최대공약수 구하기
        // 1부터 n과 m 중 작은 수까지 반복하면서 최대공약수를 찾는다.
        for (int i = 1; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i; // i가 n과 m의 공약수이므로 최대공약수로 갱신한다.
            }
        }
        // 최소공배수 구하기
        // 두 수의 곱을 최대공약수로 나누면 최소공배수가 된다.
        int lcm = (n * m) / gcd;

        // 배열에 담아 반환
        return new int[] {gcd, lcm};
    }
}