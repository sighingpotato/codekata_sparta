public class Solution18 {
    public int solution18(String s) {
        int sign = 1; // 부호(양수)
        int result = 0;
        int start = 0;

        // 첫 번째 문자가 부호인지 확인
        if (s.charAt(0) == '-') {
            sign = -1; // 음수 부호 처리
            start = 1; // 숫자는 1번 인덱스부터 시작
        } else if (s.charAt(0) == '+') {
            start = 1;
        }

        // 각 자리 숫자를 순서대로 계산
        for (int i = start; i < s.length(); i++) {
            result = result * 10 + (s.charAt(i) - '0'); // 자리수 올림 후 현재 숫자 더하기
        }

        // 부호 적용
        return result * sign;
    }
}
