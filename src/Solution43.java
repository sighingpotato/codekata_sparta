public class Solution43 {
    public int solution(String t, String p) {
        int answer = 0;
        int pLength = p.length(); // 비교할 부분 문자열 길이
        long pNum = Long.parseLong(p); // p를 숫자로 변환

        // t에서 p의 길이만큼 잘라낼 수 있는 마지막까지 반복
        for (int i = 0; i <= t.length() - pLength; i++) {
            // i부터 i + pLength 전까지 글자를 자른다.
            String subStr = t.substring(i, i + pLength);

            // 자른 문자열을 숫자로 변환
            long subNum = Long.parseLong(subStr);

            // p의 숫자보다 작거나 같으면 정답 카운트 증가
            if (subNum <= pNum) {
                answer++;
            }
        }
        return answer;
    }
}
