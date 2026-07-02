public class Solution65 {
public int solution(String s) {
        int answer = 0;      // 분해된 문자열의 총 개수
        char x = ' ';        // 현재 구역의 기준이 되는 첫 글자
        int countX = 0;      // x와 같은 글자가 나온 횟수
        int countNotX = 0;   // x와 다른 글자가 나온 횟수

        // 문자열을 첫 글자부터 마지막 글자까지 순서대로 하나씩 읽는다.
        for (int i = 0; i < s.length(); i++) {

            // 새로운 문자열 분해 구역이 시작되는 순간
            // 두 카운터가 모두 0이라는 것은 새로운 구역의 시작을 의미한다.
            if (countX == 0 && countNotX == 0) {
                x = s.charAt(i); // 현재 글자를 새로운 기준 'x'로 잡는다.
            }

            // 글자 카운트하기
            if (s.charAt(i) == x) {
                countX++;       // 기준 글자와 같으면 countX 증가
            } else {
                countNotX++;    // 기준 글자와 다르면 countNotX 증가
            }

            // 두 카운터의 횟수가 같아지는 순간
            if (countX == countNotX) {
                answer++;       // 문자열이 하나 성공적으로 분리되었으므로 개수 추가
                countX = 0;     // 다음 구역을 위해 카운터 초기화
                countNotX = 0;  // 다음 구역을 위해 카운터 초기화
            }
        }

        // 문장이 끝났는데 아직 분리되지 못하고 남은 글자가 있는 경우
        // 카운터가 0이 아니라는 것은 분리되지 못한 잔여 문자열이 꼬리에 남아있다는 뜻
        if (countX > 0) {
            answer++; // 마지막 잔여 문자열도 하나의 덩어리로 인정하여 추가
        }

        return answer;
    }
}
