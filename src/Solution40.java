public class Solution40 {
    public int solution40(int n) {
        String reversedBase3 = ""; // 3진수로 변환한 후 뒤집은 문자열을 담을 변수

        // 3으로 나누면서 나머지를 이어붙여 뒤집힌 3진법 문자열을 만든다.
        while (n > 0) {
            reversedBase3 += (n % 3); // 나머지를 구해서 뒤에 붙임
            n /= 3; // 몫을 다시 n에 저장
        }

        int answer = 0;
        int power = 1; // 3의 거듭제곱을 계산하기 위한 변수

        // 완성된 3진법 문자열을 뒤에서부터 읽으면서 10진수로 변환
        for (int i = reversedBase3.length() - 1; i >= 0; i--) {
            // 글자를 숫자로 변환
            int digit = reversedBase3.charAt(i) - '0'; // '0'을 빼서 숫자로 변환
            answer += digit * power; // 각 자리의 값을 더함
            power *= 3; // 다음 자리로 이동하기 위해 3의 거듭제곱을 증가시킴
        }
        return answer;
    }
}
