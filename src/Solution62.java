public class Solution62 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            if (canPronounce(s)) {
                answer++;
            }
        }

        return answer;
    }

    public int solution62(String[] babbling) {
        return solution(babbling);
    }

    private boolean canPronounce(String s) {
        int len = s.length();
        int index = 0;
        int lastPronIndex = -1; // 0: aya, 1: ye, 2: woo, 3: ma

        while (index < len) {
            boolean match = false;

            // 1. aya (길이 3)
            if (index + 3 <= len && s.substring(index, index + 3).equals("aya")) {
                if (lastPronIndex == 0) return false; // 연속 발음 불가
                lastPronIndex = 0;
                index += 3;
                match = true;
            }
            // 2. ye (길이 2)
            else if (index + 2 <= len && s.substring(index, index + 2).equals("ye")) {
                if (lastPronIndex == 1) return false; // 연속 발음 불가
                lastPronIndex = 1;
                index += 2;
                match = true;
            }
            // 3. woo (길이 3)
            else if (index + 3 <= len && s.substring(index, index + 3).equals("woo")) {
                if (lastPronIndex == 2) return false; // 연속 발음 불가
                lastPronIndex = 2;
                index += 3;
                match = true;
            }
            // 4. ma (길이 2)
            else if (index + 2 <= len && s.substring(index, index + 2).equals("ma")) {
                if (lastPronIndex == 3) return false; // 연속 발음 불가
                lastPronIndex = 3;
                index += 2;
                match = true;
            }

            // 네 가지 발음 중 어떤 것과도 매칭되지 않으면 발음할 수 없는 단어
            if (!match) {
                return false;
            }
        }

        return true; // 전체 문자열을 발음할 수 있음
    }
}
