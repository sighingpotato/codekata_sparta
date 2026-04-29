public class Solution21 {
    public boolean solution21(int x) {
        int originalX = x; // 원본 숫자 보관
        int sum = 0;

        // 자릿수 쪼개서 더하기
        while (x > 0) {
            sum = sum + x % 10; // 맨 끝자리 숫자 더하기
            x = x / 10; // 맨 끝자리 숫자 지우기
        }

        // 원본 숫자가 자릿수의 합으로 나누어 떨어지는지 검사
        if (originalX % sum == 0) {
            return true;
        } else {
            return false;
        }
    }
}