public class Solution36 {
    public boolean solution36(String s) {
        // 처음에 무조건 true로 가정하고 시작
        boolean answer = true;

        // 길이를 검사한다. 4 또는 6이 아니면 false
        if (s.length() != 4 && s.length() != 6) {
            answer = false;
        }
        // 길이가 맞다면, 글자를 하나씩 확인
        else {
            for (int i = 0; i< s.length(); i++) {
                char ch = s.charAt(i);

                // 글자가 숫자가 아니면 false
                if (ch <'0' || ch > '9') {
                    answer = false;
                    break; // 더 이상 검사할 필요 없음
                }
            }
        }
        return answer;
    }
}